package projetIMAFA.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import projetIMAFA.entity.EmployeeSalary;

@Repository
public interface EmployeeSalaryRepository extends JpaRepository<EmployeeSalary,Integer> {
	@Query("SELECT s FROM EmployeeSalary s WHERE work_hours= ?1")
	List<EmployeeSalary> retrieveSalaryByWorkhours(String wk);

	@Query("select Max(u.Work_hours+u.Extra_hours), u.Salary_ID from EmployeeSalary u")  
	public List<?> BestEmployee();
	
	@Query("SELECT u.CIN FROM User u WHERE u.Role_User <> 'ROLE_CLIENT' ")  
	public List<Long> Employeecin();
	
	@Transactional
	@Modifying
	@Query(value="UPDATE employee_salary set salary=(work_hours*15)+(extra_hours*20)",nativeQuery=true)
	public void salary();

}

