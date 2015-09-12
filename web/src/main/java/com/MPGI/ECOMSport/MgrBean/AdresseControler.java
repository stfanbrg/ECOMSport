package com.MPGI.ECOMSport.MgrBean;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.MPGI.ECOMSport.EJBentity.Adresse;
import com.MPGI.ECOMSport.EJBsession.AdresseInterfaceLocal;



@ManagedBean(name="adresseControler")
public class AdresseControler {
	
	private Adresse adresse = new Adresse();
	@EJB
	private AdresseInterfaceLocal service;

	
	public Adresse getAdresse() {
		return adresse;
	}
 
	public List<Adresse> getAllAdresses() {
		return service.findAllAdresses();
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public void saveAdresse(Adresse newAdresse) {
		/*newAdresse.setActive(true);
		newAdresse.setIdClient(10);		*/
		service.add(newAdresse);
	}
	
	public Adresse readAdresse(int idclient) {
		return service.find(idclient);
	}
}
