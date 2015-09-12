package com.MPGI.ECOMSport.EJBsession;


import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.MPGI.ECOMSport.EJBentity.Article;


@Stateless
@LocalBean
public class ArticleDao extends AbstractDao<Article, Integer> implements InterfaceDao<Article, Integer> {


    public ArticleDao() {
        super(Article.class);
    }
}
