package com.MPGI.ECOMSport.EJBsession;


import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.MPGI.ECOMSport.EJBentity.Adresse;

@Stateless
public class AdresseService implements AdresseInterfaceLocal{

	@PersistenceContext(name = "AdresseApp")
	private EntityManager em;

	@Override
	public void  add(Adresse newAdresse){

		em.persist(newAdresse);
	}

	@Override
	public void edit(Adresse newAdresse) {

		em.merge(newAdresse);
	}


	public Adresse find(Object id){
		return em.find(com.MPGI.ECOMSport.EJBentity.Adresse.class, id);

	}
	@Override
	public List<Adresse> findAllAdresses() {
		// TODO Auto-generated method stub
		return em.createQuery("SELECT object(a) FROM Adresse a",Adresse.class).getResultList();
	}
}
