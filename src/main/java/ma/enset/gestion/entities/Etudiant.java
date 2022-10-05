package ma.enset.gestion.entities;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
public class Etudiant  implements Serializable {

	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long idEtudiant;
		@NotEmpty
		@Size(max=60,min=3) 
		private String nomEtudiant;
		@NotEmpty
		@Size(max=60,min=3) 
		private String prenomEtudiant;
		
		private long cinEtudiant;
		private String niveauEtudiant;
		private String specialiteEtudiant;
		
		public Etudiant(Long idEtudiant, String nomEtudiant, String prenomEtudiant,long cinEtudiant,String niveauEtudiant,String specialiteEtudiant) {
			super();
			this.idEtudiant = idEtudiant;
			this.nomEtudiant = nomEtudiant;
			this.prenomEtudiant = prenomEtudiant;
			this.cinEtudiant= cinEtudiant;
			this.niveauEtudiant=niveauEtudiant;
			this.specialiteEtudiant=specialiteEtudiant;
			
		}
		
		public long getCinEtudiant() {
			return cinEtudiant;
		}

		public void setCinEtudiant(long cinEtudiant) {
			this.cinEtudiant = cinEtudiant;
		}

		public String getNiveauEtudiant() {
			return niveauEtudiant;
		}

		public void setNiveauEtudiant(String niveauEtudiant) {
			this.niveauEtudiant = niveauEtudiant;
		}

		public String getSpecialiteEtudiant() {
			return specialiteEtudiant;
		}

		public void setSpecialiteEtudiant(String specialiteEtudiant) {
			this.specialiteEtudiant = specialiteEtudiant;
		}

		public Etudiant() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Long getIdEtudiant() {
			return idEtudiant;
		}

		public void setIdEtudiant(Long idEtudiant) {
			this.idEtudiant = idEtudiant;
		}

		public String getNomEtudiant() {
			return nomEtudiant;
		}

		public void setNomEtudiant(String nomEtudiant) {
			this.nomEtudiant = nomEtudiant;
		}

		public String getPrenomEtudiant() {
			return prenomEtudiant;
		}

		public void setPrenomEtudiant(String prenomEtudiant) {
			this.prenomEtudiant = prenomEtudiant;
		}
		
		


}
