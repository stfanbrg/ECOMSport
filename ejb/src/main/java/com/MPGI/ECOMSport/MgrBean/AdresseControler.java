package com.MPGI.ECOMSport.MgrBean;

import javax.ejb.EJB;
import javax.annotation.*;

import com.MPGI.ECOMSport.EJBsession.AdresseService;
import com.MPGI.ECOMSport.EJBentity.Adresse;



@ManagedBean
public class AdresseControler {
	@EJB
	private AdresseService service;

	public void saveAdresse(Adresse newAdresse) {
		service.add(newAdresse);
	}
	
	public Adresse readAdresse(int idclient) {
		return service.find(idclient);
	}
}
