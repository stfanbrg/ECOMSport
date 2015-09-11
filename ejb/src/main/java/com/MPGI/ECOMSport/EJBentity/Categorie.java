package com.MPGI.ECOMSport.EJBentity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/*import javax.persistence.TableGenerator;*/
 
@Entity
@Table(name = "categorie")
public class Categorie {
	
	/*@TableGenerator(name = "employee_gen", table = "id_gen", pkColumnName = "gen_name", valueColumnName = "gen_val", allocationSize = 1, pkColumnValue = "employee_gen")
	*/
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idCategorie;
	
	@Column(name = "IdTheme")
	private int idTheme;
	
	@Column(name = "Nom")
	private String nom;

	public int getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(int idCategorie) {
		this.idCategorie = idCategorie;
	}

	public int getIdTheme() {
		return idTheme;
	}

	public void setIdTheme(int idTheme) {
		this.idTheme = idTheme;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}
