package com.MPGI.ECOMSport.EJBsession;

import javax.ejb.Remote;

import com.MPGI.ECOMSport.EJBentity.Adresse;

@Remote
public interface AdresseInterfaceRemote {
		public void  add(Adresse newAdresse);
		public void edit(Adresse newAdresse);
		public Adresse find(Object id);
}
