package com.MPGI.ECOMSport.MgrBean;

import javax.ejb.EJB;

import javax.faces.bean.ManagedBean;

import com.MPGI.ECOMSport.EJBsession.AdresseService;
import com.MPGI.ECOMSport.EJBentity.Adresse;



@ManagedBean
public class AdresseControler {
	
	private Adresse adresse = new Adresse();
	@EJB
	private AdresseService service;

	
	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public void saveAdresse(Adresse newAdresse) {
		newAdresse.setActive(true);
		service.add(newAdresse);
	}
	
	public Adresse readAdresse(int idclient) {
		return service.find(idclient);
	}
}
