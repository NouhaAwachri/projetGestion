package ma.enset.gestion;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import ma.enset.gestion.entities.Etudiant;
import ma.enset.gestion.metier.IGestionMetier;

@Controller
public class GestionController {

		
		@Autowired
		private IGestionMetier metier;
		
		@RequestMapping(value="/index")
		public String index(Model model) {
			model.addAttribute("etudiant", new Etudiant());
			model.addAttribute("etudiants", metier.listEtudiants());
				return "etudiants";
		}
		
		@RequestMapping(value="/editEtudiant/saveEtudiant")
		public String editsaveEtudiant(@Valid Etudiant e, BindingResult bindingResult, Model model) {
			if(bindingResult.hasErrors()) {
				return "etudiants";
			}
			if(e.getIdEtudiant()==null) {
				metier.addEtudiant(e);
			} else metier.updateEtudiant(e);
		model.addAttribute("etudiant", new Etudiant());
		model.addAttribute("etudiants", metier.listEtudiants());
			return "etudiants";
		}
		
		@RequestMapping(value="/editEtudiant/editEtudiant/saveEtudiant")
		public String editeditsaveEtudiant(@Valid Etudiant e, BindingResult bindingResult, Model model) {
			if(bindingResult.hasErrors()) {
				return "etudiants";
			}
			if(e.getIdEtudiant()==null) {
				metier.addEtudiant(e);
			} else metier.updateEtudiant(e);
		model.addAttribute("etudiant", new Etudiant());
		model.addAttribute("etudiants", metier.listEtudiants());
			return "etudiants";
		}
		
		@RequestMapping(value="/editEtudiant/editEtudiant/{id}")
		public  String	editedit(@PathVariable(value="id")
		Long	id,  Model	model){
			Etudiant e=metier.editEtudiant(id);
			model.addAttribute("etudiant", e);
			model.addAttribute("etudiants", metier.listEtudiants());
				return "etudiants";
		}
		
		@RequestMapping(value="/saveEtudiant")
		public String saveProduit(@Valid Etudiant e, BindingResult bindingResult, Model model) {
			if(bindingResult.hasErrors()) {
				return "etudiants";
			}
			if(e.getIdEtudiant()==null) {
				metier.addEtudiant(e);
			} else metier.updateEtudiant(e);
		model.addAttribute("etudiant", new Etudiant());
		model.addAttribute("etudiants", metier.listEtudiants());
			return "etudiants";
		}
		
		@RequestMapping(value="/deleteEtudiant")
		public String delete(@RequestParam(value="id")
		Long id, Model model){
			metier.deleteEtudiant(id);
			model.addAttribute("etudiant", new Etudiant());
			model.addAttribute("etudiants", metier.listEtudiants());
				return "etudiants";
		}
		
		@RequestMapping(value="/editEtudiant/{id}")
		public  String	edit(@PathVariable(value="id")  Long id,  Model	model){
			Etudiant  e =metier.editEtudiant(id);
			model.addAttribute("etudiant", e);
			model.addAttribute("etudiants", metier.listEtudiants());
				return "etudiants";
		}
		
		@RequestMapping(value="/listEtudiants/{mc}") 
		@ResponseBody
		public List<Etudiant> listEtudiants(@PathVariable(value="mc")String mc){ 
			return metier.chercherEtudiants(mc);
		}
		
		
	

	}


