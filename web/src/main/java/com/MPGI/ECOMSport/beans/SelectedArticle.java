package com.MPGI.ECOMSport.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.MPGI.ECOMSport.EJBentity.Article;


@ManagedBean(name = "selectedArticle")
@SessionScoped
public class SelectedArticle extends Article {
	public int idSelectedArticle;
	
	public void Init()
	{
		idSelectedArticle = 1;
	}
	public int getIdSelectedArticle() {
		return idSelectedArticle;
	}
	public void setIdSelectedArticle(int idSelectedArticle) {
		this.idSelectedArticle = idSelectedArticle;
	}
}
