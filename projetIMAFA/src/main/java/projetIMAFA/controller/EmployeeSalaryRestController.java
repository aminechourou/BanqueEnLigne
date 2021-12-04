package projetIMAFA.controller;
/*
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

//import org.mapstruct.Context;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//import com.lowagie.text.DocumentException;

import projetIMAFA.entity.EmployeeSalary;
import projetIMAFA.entity.LeaveTest;
import projetIMAFA.entity.Type_Leave;
import projetIMAFA.service.EmployeeSalaryServiceImpl;
import projetIMAFA.service.IEmployeeSalaryService;
@RestController
public class EmployeeSalaryRestController {
		@Autowired
		IEmployeeSalaryService salaryService;
		@Autowired
		EmployeeSalaryServiceImpl salaryServicee;
		@GetMapping("/salaries")
		@ResponseBody
		public List<EmployeeSalary> getSalaries() {
		List<EmployeeSalary> list = salaryService.retrieveAllSalaries();
		return list;
		}
		
		
		@GetMapping("/retrieveSalary/{salaryId}")
		@ResponseBody
		public EmployeeSalary retrieveSalary(@PathVariable("salaryId") String Id) {
		return salaryService.retrieveSalary(Id);
		}
		
		
		@PostMapping("/addSalary")
		@ResponseBody
		public EmployeeSalary addSalary(@RequestBody EmployeeSalary s) {
		EmployeeSalary salary = salaryService.addSalary(s);
		salaryService.salary();
		return salary;
		}
		
		@DeleteMapping("/removeSalary/{salaryId}")
		@ResponseBody
		public void removePayment(@PathVariable("salaryId") String salaryId) {
			salaryService.deleteSalary(salaryId);
		}
		
		@PutMapping("/updateSalary")
		@ResponseBody
		public EmployeeSalary updateSalary(@RequestBody EmployeeSalary salary) {
		return salaryService.updateSalary(salary);
		}
		
		@GetMapping("/fichedepaie/{User_ID}")
		@ResponseBody		
		public EmployeeSalary fichedepaie(@PathVariable("User_ID") int User_ID) {
			return salaryService.fichedepaie(User_ID).get(0);
		}
		
		@PutMapping("/affecterSalaryToUser/{Salary_ID}/{User_ID}")
		@ResponseBody
		public void affecterSalaryToUser(@PathVariable("Salary_ID") int idp,@PathVariable("User_ID") int id) {
			salaryService.affecterSalaryToUser(idp, id);
		}
		

		
		@GetMapping(value ="/bestEmployee")
		public List<?> getBestEmployee() {

		return salaryService.BestEmployee();

		}
	/*	
		@GetMapping("/pdf-fiche")
		public void FichedepaiePdf(HttpServletResponse response) throws DocumentException, IOException {
		    response.setContentType("application/pdf");
		    DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
		    String currentDateTime = dateFormatter.format(new Date());
		     
		    String headerKey = "Content-Disposition";
		    String headerValue = "attachment; filename=fiche_de_paie" + currentDateTime + ".pdf";
		    response.setHeader(headerKey, headerValue);
			List<EmployeeSalary> listEmployeeSalary = salaryService.retrieveAllSalaries();
			FichedepaiePdf exporter = new FichedepaiePdf(listEmployeeSalary);
		    exporter.export(response);
		     
		}
		
}
	
*/
