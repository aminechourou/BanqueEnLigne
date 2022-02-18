package projetIMAFA.service;

import java.util.List;

import projetIMAFA.entity.Sicav;

public interface ISicavService {
	 List<Sicav> retrieveAllSicavs();
	 Sicav addSicav(Sicav a);
	 void deleteSicav(String id);
	 Sicav updateSicav(Sicav a);
	 Sicav retrieveSicav(String id);
}
