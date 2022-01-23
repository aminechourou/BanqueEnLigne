package projetIMAFA.service;

import java.util.List;

import projetIMAFA.entity.Obligationc;

public interface IObligationcService {
	 List<Obligationc> retrieveAllObligationcs();
	 List<Obligationc> retrieveObligationcsByNomentreprise(String nom);
	 Obligationc addObligationc(Obligationc a);
	 void deleteObligationc(String id);
	 Obligationc updateObligationc(Obligationc a);
	 Obligationc retrieveObligationc(String id);
}
