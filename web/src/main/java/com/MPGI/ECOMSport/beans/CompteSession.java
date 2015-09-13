package com.MPGI.ECOMSport.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.MPGI.ECOMSport.EJBentity.Categorie;
import com.MPGI.ECOMSport.EJBentity.Compte;
import com.MPGI.ECOMSport.EJBentity.Theme;

@ManagedBean(name = "compteSession")
@SessionScoped
public class CompteSession extends Compte {
	private Theme theme;
	private Categorie categorie;
	public Theme getTheme() {
		return theme;
	}
	public void setTheme(Theme theme) {
		this.theme = theme;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
	
}
