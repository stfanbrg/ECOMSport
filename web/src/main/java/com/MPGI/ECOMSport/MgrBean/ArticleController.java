package com.MPGI.ECOMSport.MgrBean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import com.MPGI.ECOMSport.EJBentity.Article;
import com.MPGI.ECOMSport.EJBentity.Commande;
import com.MPGI.ECOMSport.EJBsession.ArticleDao;
import com.MPGI.ECOMSport.beans.CompteSession;
import com.MPGI.ECOMSport.beans.PanierSession;


@ManagedBean(name = "articleController")
@RequestScoped
public class ArticleController {

	public static PanierSession getCurrentPanierSession() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        return (PanierSession) facesContext.getExternalContext().getSessionMap().get("panierSession");
    }
	
	@EJB
	private ArticleDao articleDao;
	public String recherche;

	@PostConstruct
	public void init() {
		Article adresse = new Article();

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
		if (CompteController.getCurrentCompte()!=null){
			if (CompteController.getCurrentCompte().getCategorie()!=null)
				return articleDao.findSelectionCategorie(CompteController.getCurrentCompte().getTheme(),CompteController.getCurrentCompte().getCategorie());
			else if(CompteController.getCurrentCompte().getTheme()!=null)
				return articleDao.findSelection(CompteController.getCurrentCompte().getTheme());
		}
		return articleDao.findAll();
	}

	public void saveAdresse(Article newArticle) {
		System.out.println(articleDao);
		articleDao.save(newArticle);
	}

	public Article readArticle(int idArticle) {
		return articleDao.findById(idArticle);
	}

	public List<Article> getPanierArticles() {
		return getCurrentPanierSession().getArticles();
	}
}
