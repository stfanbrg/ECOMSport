package com.MPGI.ECOMSport.EJBsession;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.TypedQuery;

import com.MPGI.ECOMSport.EJBentity.Article;
import com.MPGI.ECOMSport.EJBentity.Theme;


@Stateless
@LocalBean
public class ArticleDao extends AbstractDao<Article, Integer> implements InterfaceDao<Article, Integer> {


	public ArticleDao() {
		super(Article.class);
	}

	public List<Article> findByLikeName(String name){
		if(name.equals(""))
			return findAll();
		return  em.createQuery("SELECT object(a) FROM Article a WHERE a.nom LIKE :articleName",Article.class)
				.setParameter("articleName",
						"%"+name+"%")
				.getResultList();
	}

	public List<Article> findSelection(Theme theme){
		List<Article> list = new ArrayList<Article>();
		if(theme!=null){
			TypedQuery<Article> query = em.createQuery("SELECT a from article NATURAL JOIN categorie c NATURAL JOIN theme t WHERE t.nom=:themeName",Article.class);
			return query.setParameter("themeName", theme.getNom()).getResultList();
		}
		else
			return findAll();
	}
}
