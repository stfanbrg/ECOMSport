package com.MPGI.ECOMSport.EJBsession;


import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.MPGI.ECOMSport.EJBentity.Categorie;


@Stateless
@LocalBean
public class CategorieDao extends AbstractDao<Categorie, Integer> implements InterfaceDao<Categorie, Integer> {


    public CategorieDao() {
        super(Categorie.class);
    }
}