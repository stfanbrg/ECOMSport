package com.MPGI.ECOMSport.EJBentity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/*import javax.persistence.TableGenerator;*/
 
@Entity
@Table(name = "commande")
public class Commande {
	
	/*@TableGenerator(name = "employee_gen", table = "id_gen", pkColumnName = "gen_name", valueColumnName = "gen_val", allocationSize = 1, pkColumnValue = "employee_gen")
	*/
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idCommande;
 
	@Column(name = "IdAdresse")
	private int idAdresse;
	
	@Column(name = "Prix")
	private int prix;
	
	@Column(name = "Date")
	private Date date;
	
	@Column(name = "Statut")
	private String statut;

	public int getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}

	public int getIdAdresse() {
		return idAdresse;
	}

	public void setIdAdresse(int idAdresse) {
		this.idAdresse = idAdresse;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}
}
