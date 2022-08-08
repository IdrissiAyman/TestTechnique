package com.example.test.test.modules;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Inventaire {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int inventaire_id;
	@ManyToOne
	@JoinColumn(name = "materiel_id")
	public Materiel materiel_id;
	@ManyToOne
	@JoinColumn(name = "magasin_id")	
	public Magasin magasin_id;
	public String updated_at;


	public Inventaire(int inventaire_id, Materiel materiel_id, Magasin magasin_id, String updated_at) {
	super();
	this.inventaire_id = inventaire_id;
	this.materiel_id = materiel_id;
	this.magasin_id = magasin_id;
	this.updated_at = updated_at;
}


	public Inventaire() {
		
	}


	public int getInventaire_id() {
		return inventaire_id;
	}


	public void setInventaire_id(int inventaire_id) {
		this.inventaire_id = inventaire_id;
	}


	public Materiel getMateriel_id() {
		return materiel_id;
	}


	public void setMateriel_id(Materiel materiel_id) {
		this.materiel_id = materiel_id;
	}


	public Magasin getMagasin_id() {
		return magasin_id;
	}


	public void setMagasin_id(Magasin magasin_id) {
		this.magasin_id = magasin_id;
	}


	public String getUpdated_at() {
		return updated_at;
	}


	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}
	
}
