package projetIMAFA.repo;
/*
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import projetIMAFA.entity.EmployeeSalary;
//import projetIMAFA.entity.Payment;
//import projetIMAFA.entity.Type_Payment;
@Repository
public interface EmployeeSalaryRepository extends JpaRepository<EmployeeSalary,Integer> {
	/*@Query("SELECT s FROM EmployeeSalary s WHERE work_hours= ?1")
	List<EmployeeSalary> retrieveSalaryByWorkhours(work_hours wk);
*/

	/*fiche de paie
	@Query(value="SELECT salary_id, month, year, extra_hours, work_hours, salary FROM employee_salary where user_user_id = :User_ID ",nativeQuery=true )
	public List<EmployeeSalary>fichedepaie(@Param ("User_ID")int User_ID);*/


	//fiche de paie
	//@Query(value="SELECT * FROM employee_salary where user_user_id=:User_ID ",nativeQuery=true )
	//public List<EmployeeSalary>fichedepaie(@Param ("User_ID")int User_ID);

	//meilleur employee
/*
	@Query("select Max(u.Work_hours+u.Extra_hours), u.Salary_ID from EmployeeSalary u")  
	public List<?> BestEmployee();


	//salaire calcul
	@Transactional
	@Modifying
	@Query(value="UPDATE employee_salary set salary=(work_hours*15)+(extra_hours*20)",nativeQuery=true)
	public int salary();

}
//
 * */
