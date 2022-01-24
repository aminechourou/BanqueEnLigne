package projetIMAFA.service;

import java.util.List;

import projetIMAFA.entity.Obligation;

public interface IObligationService {
	 List<Obligation> retrieveAllObligations();
	 List<Obligation> retrieveObligationsByNomentreprise(String nom);
	 Obligation addObligation(Obligation a);
	 void deleteObligation(String id);
	 Obligation updateObligation(Obligation a);
	 Obligation retrieveObligation(int id);
	 void verifiequantite(Integer q,Integer id);
	 List<Obligation> retrieveObligationsByQ();
}
