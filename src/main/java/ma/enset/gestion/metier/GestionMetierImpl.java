package ma.enset.gestion.metier;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import ma.enset.gestion.dao.IGestionDAO;
import ma.enset.gestion.entities.Etudiant;
public class GestionMetierImpl  implements IGestionMetier{

	
		private IGestionDAO dao;

		public void setDao(IGestionDAO dao) {
			this.dao = dao;
		}
		
		@Override
		@Transactional
		public void addEtudiant(Etudiant e) {
			dao.addEtudiant(e);
		}

		@Override
		public List<Etudiant> listEtudiants() {
			// TODO Auto-generated method stub
			return dao.listEtudiants();
		}

		@Override
		@Transactional
		public void deleteEtudiant(Long idE) {
			// TODO Auto-generated method stub
			dao.deleteEtudiant(idE);
		}

		@Override
		public Etudiant editEtudiant(Long idE) {
			// TODO Auto-generated method stub
			return dao.editEtudiant(idE);
		}

		@Override
		@Transactional
		public void updateEtudiant(Etudiant e) {
			// TODO Auto-generated method stub
			dao.updateEtudiant(e);
		}

		@Override
		@Transactional
		public List<Etudiant> chercherEtudiants(String motCle) {
			// TODO Auto-generated method stub
			return dao.chercherEtudiants(motCle);
		}
	}



