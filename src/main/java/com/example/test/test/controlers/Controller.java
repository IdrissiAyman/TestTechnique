package com.example.test.test.controlers;

import java.util.List;
import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.test.modules.Categorie;
import com.example.test.test.modules.Employe;
import com.example.test.test.modules.Inventaire;
import com.example.test.test.modules.Magasin;
import com.example.test.test.modules.Materiel;
import com.example.test.test.repos.CategorieRepo;
import com.example.test.test.repos.EmployeRepo;
import com.example.test.test.repos.InventaireRepo;
import com.example.test.test.repos.MagasinRepo;
import com.example.test.test.repos.MaterielRepo;

@RestController
public class Controller {

	@Autowired
	private MagasinRepo magasinRepo;
	@Autowired
	private EmployeRepo employerepo;
	@Autowired
	private CategorieRepo categorierepo;
	@Autowired
	private MaterielRepo materielRepo;
	@Autowired
	private MaterielRepo inventaireRepo;
	
	@PostMapping("addmagasin")
	public void addMagasin(@RequestBody Magasin magasin) {
		magasinRepo.save(magasin);
	}
	
	@PostMapping("addemploye")
	public void addEmploye(@RequestBody Employe employe) {
		employerepo.save(employe);
	}
	
	@PostMapping("addcategorie")
	public void addCategorie(@RequestBody Categorie categorie) {
		categorierepo.save(categorie);
	}
	
	@PostMapping("addmateriel")
	public void addmaterial(@RequestBody Materiel materiel) {
		materielRepo.save(materiel);
	}
	@PostMapping("addInventaire")
	public void addInventaire(@RequestBody Inventaire inventaire) {
		//inventaireRepo.save(inventaire);
	}
	
	@PutMapping("modifyMateriel")
	public void modifymaterial(@RequestBody Materiel materiel) {
		materielRepo.save(materiel);
	}
	@PostMapping("addInventaire")
	public void modifyInventaire(@RequestBody Inventaire inventaire) {
		//inventaireRepo.save(inventaire);
	}
	
	
	@DeleteMapping("deleteMateriel")
	public void deletematerial(@RequestBody Materiel materiel) {
		materielRepo.delete(materiel);
	}
	@DeleteMapping("deleteInventaire")
	public void deleteinventaire(@RequestBody Inventaire inventaire) {
		//inventaireRepo.delete(inventaire);
	}
	
	@GetMapping("getallMateriels")
	public List<Materiel> getmateriel(){
		List<Materiel> list = new Vector<Materiel>();
		materielRepo.findAll().forEach(list::add);
		return list;
	}
	
}