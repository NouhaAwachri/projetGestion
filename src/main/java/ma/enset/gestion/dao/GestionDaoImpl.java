package ma.enset.gestion.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import ma.enset.gestion.entities.Etudiant;

public class GestionDaoImpl implements IGestionDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void addEtudiant(Etudiant e) {
		entityManager.persist(e);
	}

	@Override
	public List<Etudiant> listEtudiants() {
		// TODO Auto-generated method stub
		Query req=entityManager.createQuery("select e from Etudiant e");
		return req.getResultList();
	}

	@Override
	public void deleteEtudiant(Long idE) {
		// TODO Auto-generated method stub
		Etudiant e = entityManager.find(Etudiant.class, idE);
		entityManager.remove(e);
	}

	@Override
	public Etudiant editEtudiant(Long idE) {
		// TODO Auto-generated method stub
		Etudiant e =entityManager.find(Etudiant.class, idE);
		return e;
	}

	@Override
	public void updateEtudiant(Etudiant e) {
		// TODO Auto-generated method stub
		entityManager.merge(e);
	}

	@Override
	public List<Etudiant> chercherEtudiants(String motCle) {
		// TODO Auto-generated method stub
		Query req=entityManager.createQuery("select e from Etudiant e where e.nomEtudiant like :x");
		req.setParameter("x", "%"+motCle+"%");
		return req.getResultList();
	

	}
	}
