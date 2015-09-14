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

	// pour stocker le resultat des recherches
	public String recherche;
	private List<Article> myListeArticle; 

	@PostConstruct
	public void init() {
		
		/*Article myArticle = new Article();
		myArticle.setNom("Ski");
		myArticle.setMarque("Dynamic");
		myArticle.setPrix(200);
		myArticle.setImage("Roller.jpg");
		myArticle.setStock(35);
		
		myListeArticle.add(myArticle);*/
		
	}

	public String getRecherche() {
		return recherche;
	}

	public void setRecherche(String recherche) {
		this.recherche = recherche;
	}

	public List<Article> getAllArticles() {			
		return articleDao.findAll();
			
	}

	public List<Article> getArticlesSearch() {
		
		if (recherche!=null)
			return articleDao.findByLikeName(this.recherche);
		else if(CompteController.getCurrentCompte().getTheme()!=null)
			 articleDao.findSelection(CompteController.getCurrentCompte().getTheme());
		
		return articleDao.findAll();
	}

	public void saveAdresse(Article newArticle) {
		System.out.println(articleDao);
		articleDao.save(newArticle);
	}

	public Article readArticle(int idArticle) {
		System.out.println("idarticle" + idArticle);
		return articleDao.findById(idArticle);
	}

}
