package com.MPGI.ECOMSport.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
 
@Entity
@Table(name = "commandearticle")
public class CommandeArticle {
	
	/*@TableGenerator(name = "employee_gen", table = "id_gen", pkColumnName = "gen_name", valueColumnName = "gen_val", allocationSize = 1, pkColumnValue = "employee_gen")
	*/
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idCommandeArticle;
	
	@Column(name = "IdCommande")
	private int idCommande;
	
	@Column(name = "IdArticle")
	private int idArticle;
	
	@Column(name = "Quantite")
	private int quantite;

	public int getIdCommandeArticle() {
		return idCommandeArticle;
	}

	public void setIdCommandeArticle(int idCommandeArticle) {
		this.idCommandeArticle = idCommandeArticle;
	}

	public int getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}

	public int getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
}
