package projetIMAFA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projetIMAFA.entity.NomOperation;
import projetIMAFA.entity.Operation;
import projetIMAFA.repo.ICompteBancaireRepository;
import projetIMAFA.repo.IOperationRepository;

@Service
public class OperationServiceImpl implements IOperationService{
	
	@Autowired
	IOperationRepository operationRepository;

	
	public int ajouterOuModifierOperation(Operation operation) {
		operationRepository.save(operation);
		return operation.getIdOperation();
	}

	public void deleteOperationById(int operationId)
	{
		Operation operation = operationRepository.findById(operationId).get();

		operationRepository.delete(operation);
	}
	
	public Operation getOperationById(int operationId) {
		return operationRepository.findById(operationId).get();
	}
	
	public List<Operation> getOperationByNomOperation(NomOperation nomOperation) {
		return (List<Operation>) operationRepository.getOperationByNomOperation(nomOperation);
	}
	
	public List<Operation> getAllOperations() {
		return (List<Operation>) operationRepository.findAll();
	}
}
