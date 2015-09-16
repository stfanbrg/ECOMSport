package com.MPGI.ECOMSport.EJBsession;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.MPGI.ECOMSport.EJBentity.Article;

@ManagedBean(name = "selectedArticle")
@SessionScoped
public class SelectedArticle extends Article {
}

