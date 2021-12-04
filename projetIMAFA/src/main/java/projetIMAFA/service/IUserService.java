package projetIMAFA.service;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import javax.servlet.http.Part;

import org.springframework.web.multipart.MultipartFile;

import projetIMAFA.entity.Utilisateur;



public interface IUserService {

	 List<Utilisateur> retrieveAllUtilisateurs();
	 Utilisateur addUtilisateur(Utilisateur u);
	 void deleteUtilisateur(String id);
	 Utilisateur updateUtilisateur(Utilisateur u);
	 Utilisateur retrieveUtilisateur(String id);
	// List<Utilisateur> retrieveUtilisateursByRole(Role_User role);
	 void verifie_account(String id);
	 List<Utilisateur> retrieveUtilisateursByDate(String d1,String d2) throws ParseException;
	 Utilisateur login(String email,String password);
	 Utilisateur getcode(String email);
	 Utilisateur getRandom(String random);
	 void upMdp(String random,String mdp);
	 void upRandom(Integer random,String random1);
	 List<Object> getUtilisateurbydate();
	 List<Object> getUtilisateurbyarea();
	 void uploadFile(Part file)throws IllegalStateException, IOException;
}
