package projetIMAFA.controller;

import java.io.IOException;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
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


import projetIMAFA.entity.*;
import projetIMAFA.service.*;
@Transactional
@Controller(value = "SalaryController") // Name of the bean in Spring IoC
@ELBeanName(value = "SalaryController") // Name of the bean used by JSF
public class EmployeeSalaryRestController {
	private int Salary_ID;
	private int Month;
	private int Year;	
	private int Work_hours;
	private int Extra_hours;
	private float salary;
	private EmployeeSalary salaryy;
	private Integer SalaryIdToBeUpdated;
	private List<EmployeeSalary> salaries;
	private List<Integer> cins;
	private Integer cin;
	
	public Integer getSalaryIdToBeUpdated() {
		return SalaryIdToBeUpdated;
	}


	public void setSalaryIdToBeUpdated(Integer salaryIdToBeUpdated) {
		SalaryIdToBeUpdated = salaryIdToBeUpdated;
	}


	public EmployeeSalary getSalaryy() {
		return salaryy;
	}


	public void setSalaryy(EmployeeSalary salaryy) {
		this.salaryy = salaryy;
	}


	public void setSalaries(List<EmployeeSalary> salaries) {
		this.salaries = salaries;
	}


	public int getSalary_ID() {
		return Salary_ID;
	}


	public void setSalary_ID(int salary_ID) {
		Salary_ID = salary_ID;
	}


	public int getMonth() {
		return Month;
	}


	public void setMonth(int month) {
		Month = month;
	}


	public int getYear() {
		return Year;
	}


	public void setYear(int year) {
		Year = year;
	}


	public int getWork_hours() {
		return Work_hours;
	}


	public void setWork_hours(int work_hours) {
		Work_hours = work_hours;
	}


	public int getExtra_hours() {
		return Extra_hours;
	}


	public void setExtra_hours(int extra_hours) {
		Extra_hours = extra_hours;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}


	public IEmployeeSalaryService getSalaryService() {
		return salaryService;
	}


	public void setSalaryService(IEmployeeSalaryService salaryService) {
		this.salaryService = salaryService;
	}


	public EmployeeSalaryServiceImpl getSalaryServicee() {
		return salaryServicee;
	}


	public void setSalaryServicee(EmployeeSalaryServiceImpl salaryServicee) {
		this.salaryServicee = salaryServicee;
	}

	@Autowired
	IEmployeeSalaryService salaryService;
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
	
	public void addSalaryy() throws ParseException {
		salaryService.addSalary(new EmployeeSalary(Month,Year,Work_hours,Extra_hours,salary) );
		salaryService.salary();
		
	}

	@DeleteMapping("/removeSalary/{salaryId}")
	@ResponseBody
	public void removePayment(@PathVariable("salaryId") String salaryId) {
		salaryService.deleteSalary(salaryId);
	}

	public void deleteSalary(String salaryId)
	{
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

	/*@GetMapping("/users-csv")
		public void downloadUsersCSV(@Context HttpServletResponse httpServletResponse) throws IOException{
			salaryServicee.generateCsvResponse(httpServletResponse);
		}*/

	@GetMapping(value ="/bestEmployee")
	public List<?> getBestEmployee() {

		return salaryService.BestEmployee();

	}


	
	public String updateSalary()throws ParseException {
		
		salaryService.updateSalary(new EmployeeSalary(SalaryIdToBeUpdated ,Month,Year,Work_hours,Extra_hours) );
		salaryService.salary();
		return("/amine/Hana/fichedepaie.jsf?faces-redirect=true");


	}
	public String displaySalaries(EmployeeSalary empl)
	{

		this.setMonth(empl.getMonth());
		this.setYear(empl.getYear());
		this.setWork_hours(empl.getWork_hours());
		this.setExtra_hours(empl.getExtra_hours());
		
		this.setSalaryIdToBeUpdated(empl.getSalary_ID());
		return("/amine/Hana/UpdateSalary.jsf?faces-redirect=true");

	}


	public List<Integer> getCins() {
		return salaryService.Employeecin();
	}


	public void setCins(List<Integer> cins) {
		this.cins = cins;
	}


	public Integer getCin() {
		return cin;
	}


	public void setCin(Integer cin) {
		this.cin = cin;
	}


}


