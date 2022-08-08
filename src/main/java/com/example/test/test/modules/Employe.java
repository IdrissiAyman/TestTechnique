package com.example.test.test.modules;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employe_id  ;
	private String nom;
	private String prenom;
	private String image_url;
	private String email;
	private String login;
	private String mdp;
	private boolean actif;
	@ManyToOne
	private Magasin magasin;
	
	public Employe() {
		
	}
	public Employe( String nom, String prenom, String image_url, String email, String login, String mdp,
			boolean actif, Magasin magasin) {
		super();
		
		this.nom = nom;
		this.prenom = prenom;
		this.image_url = image_url;
		this.email = email;
		this.login = login;
		this.mdp = mdp;
		this.actif = actif;
		this.magasin = magasin;
	}
	
	
	
	public int getEmploye_id() {
		return employe_id;
	}
	public void setEmploye_id(int employe_id) {
		this.employe_id = employe_id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public boolean isActif() {
		return actif;
	}
	public void setActif(boolean actif) {
		this.actif = actif;
	}
	public Magasin getMagasin() {
		return magasin;
	}
	public void setMagasin(Magasin magasin) {
		this.magasin = magasin;
	}

}
