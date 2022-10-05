package ma.enset.gestion.dao;

import java.util.List;


import ma.enset.gestion.entities.Etudiant;

public interface IGestionDAO {
	public void addEtudiant(Etudiant e);
	public List<Etudiant> listEtudiants();
	public void deleteEtudiant(Long idE);
	public Etudiant editEtudiant(Long idE);
	public void updateEtudiant(Etudiant e);
	public List<Etudiant> chercherEtudiants(String motCle);

}
