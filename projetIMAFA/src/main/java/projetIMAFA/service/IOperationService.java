package projetIMAFA.service;


import java.util.List;

import projetIMAFA.entity.NomOperation;
import projetIMAFA.entity.Operation;

public interface IOperationService {

	public int ajouterOuModifierOperation(Operation operation);
	public void deleteOperationById(int operationId);
	public Operation getOperationById(int operationId);
	public List<Operation> getOperationByNomOperation(NomOperation nomOperation);
	public List<Operation> getAllOperations();
}
