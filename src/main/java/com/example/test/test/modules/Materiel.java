package com.example.test.test.modules;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Materiel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int materiel_id;
	private String nom;
	private String description;
	private String image;
	private String url;
	private Taille taille;
	private int duree_location;
	private int cout_location;
	private int remplacement;
	private String updated_at;
	@ManyToOne
	@JoinColumn(name = "categorie_id")
	private Categorie categorie;
	
	public Materiel() {
		
	}
	
	public Materiel(int materiel_id, String nom, String description, String image, String url, Taille taille,
			int duree_location, int cout_location, int remplacement, String updated_at, Categorie categorie) {
		super();
		this.materiel_id = materiel_id;
		this.nom = nom;
		this.description = description;
		this.image = image;
		this.url = url;
		this.taille = taille;
		this.duree_location = duree_location;
		this.cout_location = cout_location;
		this.remplacement = remplacement;
		this.updated_at = updated_at;
		this.categorie = categorie;
	}
	
	
	public int getMateriel_id() {
		return materiel_id;
	}
	public void setMateriel_id(int materiel_id) {
		this.materiel_id = materiel_id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Taille getTaille() {
		return taille;
	}
	public void setTaille(Taille taille) {
		this.taille = taille;
	}
	public int getDuree_location() {
		return duree_location;
	}
	public void setDuree_location(int duree_location) {
		this.duree_location = duree_location;
	}
	public int getCout_location() {
		return cout_location;
	}
	public void setCout_location(int cout_location) {
		this.cout_location = cout_location;
	}
	public int getRemplacement() {
		return remplacement;
	}
	public void setRemplacement(int remplacement) {
		this.remplacement = remplacement;
	}
	public String getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
	

}
