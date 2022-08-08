package com.example.test.test.modules;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Magasin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int magasin_id;
	private String ville;
	private Employe director_personal_id;
	private String update_at;
	@OneToMany(mappedBy = "magasin")
	private List<Employe> employes;
	
	public Magasin() {
		
	}
	public Magasin(String ville, Employe director_personal_id, String update_at) {
		super();
		this.ville = ville;
		this.director_personal_id = director_personal_id;
		this.update_at = update_at;
	}
	public int getMagasin_id() {
		return magasin_id;
	}
	
	public void setMagasin_id(int magasin_id) {
		this.magasin_id = magasin_id;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public Employe getDirector_personal_id() {
		return director_personal_id;
	}
	public void setDirector_personal_id(Employe director_personal_id) {
		this.director_personal_id = director_personal_id;
	}
	public String getUpdate_at() {
		return update_at;
	}
	public void setUpdate_at(String update_at) {
		this.update_at = update_at;
	}
	
}
