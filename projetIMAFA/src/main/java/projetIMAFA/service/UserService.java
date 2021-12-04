package projetIMAFA.service;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
/*
import javax.servlet.http.Part;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import projetIMAFA.entity.*;
import projetIMAFA.repo.UserRepository;



@Service
public class UtilisateurService implements IUtilisateurService {
	@Autowired
	UserRepository UtilisateurRepository;
	private static final Logger l = LogManager.getLogger(UtilisateurService.class);

	public List<Utilisateur> retrieveAllUsers() {
		List<Utilisateur> Utilisateurs = (List<Utilisateur>) UtilisateurRepository.findAll();
		for(Utilisateur Utilisateur : Utilisateurs)
		{
			l.info("Utilisateur ++ :"+Utilisateur);
		}
		return Utilisateurs;
		
	}

	public Utilisateur addUtilisateur(Utilisateur u) {
		Utilisateur UtilisateurSaved = null;
		UtilisateurSaved=UtilisateurRepository.save(u);
		return UtilisateurSaved;
		
	}

	public void deleteUtilisateur(String id) {
		UtilisateurRepository.deleteById(Integer.parseInt(id));
		
	}

	public Utilisateur updateUtilisateur(Utilisateur u) {
		Utilisateur UtilisateurAdded = UtilisateurRepository.save(u);
		return UtilisateurAdded;
	}

	public Utilisateur retrieveUtilisateur(String id) {
	
		l.info("in retrieveUtilisateur id= "+id);
		Utilisateur u = UtilisateurRepository.findById(Integer.parseInt(id)).orElse(null);
		l.info("Utilisateur returned : "+u);
		return u;
		
	}
	
	public List<Utilisateur> retrieveUtilisateursByRole(Role_Utilisateur role)
	{
		List<Utilisateur> Utilisateurs = (List<Utilisateur>) UtilisateurRepository.retrieveUtilisateursByRole(role);
		for(Utilisateur Utilisateur : Utilisateurs)
		{
			l.info("Utilisateur ++ :"+Utilisateur);
		}
		return Utilisateurs;	
	}
	
	public void verifie_account(String id)
	{
		UtilisateurRepository.verifiedaccount(Integer.parseInt(id));
		
	}
	
	public List<Utilisateur> retrieveUtilisateursByDate(String d1,String d2) throws ParseException
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date d11 = dateFormat.parse(d1);
		Date d22 = dateFormat.parse(d2);
		List<Utilisateur> Utilisateurs = (List<Utilisateur>) UtilisateurRepository.retrieveUtilisateursByDate(d11,d22);
		for(Utilisateur Utilisateur : Utilisateurs)
		{
			l.info("Utilisateur ++ :"+Utilisateur);
		}
		return Utilisateurs;	
	}
	
	public Utilisateur login(String email,String password)
	{
		Utilisateur u=UtilisateurRepository.login(email, password);
		System.out.println(u);
        return u;
		
	}
	
	 public List<Object> getUtilisateurbydate()
	 {
		 List<Object> u =UtilisateurRepository.getUtilisateurbydate();
		 return u;
	 }
	 public List<Object> getUtilisateurbyarea()
	 {
		 List<Object> u =UtilisateurRepository.getUtilisateurbyarea();
		 return u; 
	 }

	
	public Utilisateur getcode(String email)
	{
		Utilisateur u=UtilisateurRepository.getcode(email);
        return u;
		
		
	}
	public Utilisateur getRandom(String random)
	{
		Utilisateur u=UtilisateurRepository.getRandom(Integer.parseInt(random));
        return u;
		
		
	}
	public void upMdp(String random,String mdp)
	{
		UtilisateurRepository.upMdp(Integer.parseInt(random), mdp);

	}
	public void upRandom(Integer random,String random1)
	{
		UtilisateurRepository.upRandom(random, Integer.parseInt(random1));

	}
	
	public void uploadFile(Part file) throws IllegalStateException, IOException
	{
    ((MultipartFile) file).transferTo(new File("C:Utilisateurs\\ASUS\\git\\pidev\\pidev\\src\\main\\webapp\\template\\images"+file.getName()));

	}
	
	/**********************************************************************/
	/*public void del(int id){
		UtilisateurRepository.deleteById(id);
	}

	@Override
	public List<Utilisateur> retrieveAllUtilisateurs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur addUtilisateur(Utilisateur u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUtilisateur(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Utilisateur updateUtilisateur(Utilisateur u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur retrieveUser(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Utilisateur> retrieveUsersByRole(Role_User role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Utilisateur> retrieveUsersByDate(String d1, String d2) throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur login(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur getcode(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur getRandom(String random) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> getUtilisateurbydate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> getUtilisateurbyarea() {
		// TODO Auto-generated method stub
		return null;
	}

}
*/