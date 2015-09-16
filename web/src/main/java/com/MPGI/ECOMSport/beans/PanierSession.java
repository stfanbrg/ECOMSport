package com.MPGI.ECOMSport.beans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.MPGI.ECOMSport.EJBentity.Article;
import com.MPGI.ECOMSport.EJBentity.Commande;
import com.MPGI.ECOMSport.EJBsession.ArticleDao;

@ManagedBean(name = "panierSession")
@SessionScoped
public class PanierSession extends Commande {
	
	@EJB
	private ArticleDao articleDao;
	
	public String addArticles(int idarticle) {		
		Article myArticle = articleDao.findById(idarticle);
		if (!getArticles().contains(myArticle)) 
			this.getArticles().add(myArticle);
		
		return "Panier";
	}
	
	public String isEmpty(){
		if(getArticles().isEmpty())
			return "PanierVide";
		return "Panier";
	}
}
