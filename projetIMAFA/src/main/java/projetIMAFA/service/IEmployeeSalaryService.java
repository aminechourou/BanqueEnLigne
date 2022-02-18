
package projetIMAFA.service;

import java.util.List;

import projetIMAFA.entity.EmployeeSalary;

public interface IEmployeeSalaryService {
	List<EmployeeSalary> retrieveAllSalaries();
	EmployeeSalary addSalary(EmployeeSalary s) ;
	void deleteSalary(String id);
	EmployeeSalary updateSalary(EmployeeSalary s);
	EmployeeSalary retrieveSalary(String id) ;
	List<EmployeeSalary> fichedepaie(int User_ID);
	public void salary();
	void affecterSalaryToUser(int idp, int id);
	List<?> BestEmployee();
	public List<Long> Employeecin();

}