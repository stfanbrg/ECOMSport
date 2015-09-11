package com.MPGI.ECOMSport.EJBsession;

import javax.ejb.Local;

import com.MPGI.ECOMSport.EJBentity.Adresse;
@Local
public interface AdresseInterfaceLocal {
	public void  add(Adresse newAdresse);
	public void edit(Adresse newAdresse);
	public Adresse find(Object id);
}
