package com.MPGI.ECOMSport.EJBsession;


import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.MPGI.ECOMSport.EJBentity.Article;
import com.MPGI.ECOMSport.EJBentity.Theme;

	

@Stateless
@LocalBean
public class ArticleDao extends AbstractDao<Article, Integer> implements InterfaceDao<Article, Integer> {


    public ArticleDao() {
        super(Article.class);
    }

    public List<Article> findByLikeName(String name) {
        if (name.equals(""))
            return findAll();
        return em.createQuery("SELECT object(a) FROM Article a WHERE a.nom LIKE :articleName", Article.class)
                .setParameter("articleName",
                        "%" + name + "%")
                .getResultList();
    }

    public List<Article> findSelection(Theme theme) {
        return em.createQuery("SELECT object(a) FROM Article a INNER JOIN a.categorie c INNER JOIN c.theme t WHERE t.nom =:themeName", Article.class)
                .setParameter("themeName", theme.getNom())
                .getResultList();
    }
}
