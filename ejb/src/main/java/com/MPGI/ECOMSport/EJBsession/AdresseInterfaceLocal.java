package com.MPGI.ECOMSport.EJBsession;

import java.util.List;

import javax.ejb.Local;

import com.MPGI.ECOMSport.EJBentity.Adresse;
@Local
public interface AdresseInterfaceLocal {
	void  add(Adresse newAdresse);
	void edit(Adresse newAdresse);
	Adresse find(Object id);
	List<Adresse> findAllAdresses();
}
