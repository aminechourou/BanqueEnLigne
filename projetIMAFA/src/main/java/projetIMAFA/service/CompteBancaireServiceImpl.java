package projetIMAFA.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projetIMAFA.entity.CompteBancaire;
import projetIMAFA.repo.IAgenceRepository;
import projetIMAFA.repo.ICompteBancaireRepository;

@Service
public class CompteBancaireServiceImpl implements ICompteBancaireService{

	@Autowired
	IAgenceRepository agenceRepository;
	@Autowired
	ICompteBancaireRepository compteBancaireRepository;

	@Override
	public int ajouterOuModifierCompteBancaire(CompteBancaire cb) {
		compteBancaireRepository.save(cb);
		return cb.getIdCompte();
	}

	@Override
	public void deleteCompteBancaireById(int cbId)
	{
		CompteBancaire cb = compteBancaireRepository.findById(cbId).get();
		compteBancaireRepository.delete(cb);
	}
	
	@Override
	public CompteBancaire getCompteBancaireById(int cbId) {
		return compteBancaireRepository.findById(cbId).get();
	}

}
