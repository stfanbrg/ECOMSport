package com.MPGI.ECOMSport.MgrBean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.MPGI.ECOMSport.EJBentity.Article;
import com.MPGI.ECOMSport.EJBsession.ArticleDao;


@ManagedBean(name = "articleController")
@RequestScoped
public class ArticleController {


    @EJB
    private ArticleDao articleDao;

    @PostConstruct
    public void init() {
    	Article adresse = new Article();
    }

    public List<Article> getAllArticles() {

        return articleDao.findAll();
    }

    public void saveAdresse(Article newArticle) {
        System.out.println(articleDao);
        articleDao.save(newArticle);
    }

    public Article readArticle(int idArticle) {
        return articleDao.findById(idArticle);
    }
}
