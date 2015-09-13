package com.MPGI.ECOMSport.EJBsession;


import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.MPGI.ECOMSport.EJBentity.Article;
import com.MPGI.ECOMSport.EJBentity.Categorie;
import com.MPGI.ECOMSport.EJBentity.Theme;


@Stateless
@LocalBean
public class CategorieDao extends AbstractDao<Categorie, Integer> implements InterfaceDao<Categorie, Integer> {


    public CategorieDao() {
        super(Categorie.class);
    }
    
    public List<Categorie> findCategorieByTheme(Theme theme){
    	return  em.createQuery("SELECT object(c) FROM Categorie c INNER JOIN c.theme t WHERE t.nom =:themeName",Categorie.class)
				.setParameter("themeName",theme)
				.getResultList();
	}
}