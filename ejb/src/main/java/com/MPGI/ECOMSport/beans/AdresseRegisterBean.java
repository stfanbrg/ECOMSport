package com.MPGI.ECOMSport.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.Entity;

import com.MPGI.ECOMSport.EJBentity.Adresse;

@Entity
@ManagedBean(name = "adresseRegisterBean")
@RequestScoped
public class AdresseRegisterBean extends Adresse {

}
