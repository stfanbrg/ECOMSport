package com.MPGI.ECOMSport.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/*import javax.persistence.TableGenerator;*/
 
@Entity
@Table(name = "adresse")
public class Adresse {
	
	/*@TableGenerator(name = "employee_gen", table = "id_gen", pkColumnName = "gen_name", valueColumnName = "gen_val", allocationSize = 1, pkColumnValue = "employee_gen")
	*/
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idAdresse;
 
	@Column(name = "IdClient")
	private int idClient;
 
	@Column(name = "Active")
	private boolean active;
 
	@Column(name = "Libelle")
	private String libelle;

	public int getIdAdresse() {
		return idAdresse;
	}

	public void setIdAdresse(int idAdresse) {
		this.idAdresse = idAdresse;
	}

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
 
}

