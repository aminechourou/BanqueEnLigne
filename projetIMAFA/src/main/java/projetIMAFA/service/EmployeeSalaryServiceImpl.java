
package projetIMAFA.service;
/*
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import tn.esprit.spring.entity.Payment;
import projetIMAFA.entity.*;
import projetIMAFA.repo.EmployeeSalaryRepository;
import projetIMAFA.repo.UserRepository;

	
	@Service
	public class EmployeeSalaryServiceImpl implements IEmployeeSalaryService{
		@Autowired
		EmployeeSalaryRepository salaryRepository;
		@Autowired
		UserRepository userRepository;
		private static final Logger l = LogManager.getLogger(EmployeeSalaryServiceImpl.class);
	
		public List<EmployeeSalary> retrieveAllSalaries() {
			List<EmployeeSalary> salaries = (List<EmployeeSalary>) salaryRepository.findAll();
			for(EmployeeSalary salary : salaries)
			{
				l.info("salary ++ :"+salary);
			}
			return salaries;
	
		}
	
		public EmployeeSalary addSalary(EmployeeSalary s) {
			EmployeeSalary employeeSalarySaved = null;
			employeeSalarySaved=salaryRepository.save(s);
			return employeeSalarySaved;
	
		}
	
		public void deleteSalary(String id) {
			salaryRepository.deleteById(Integer.parseInt(id));
	
		}
	
		public EmployeeSalary updateSalary(EmployeeSalary s) {
			EmployeeSalary employeeSalaryAdded = salaryRepository.save(s);
			return employeeSalaryAdded;
		}
	
		public EmployeeSalary retrieveSalary(String id) {
	
			l.info("in retrieveSalary id= "+id);
			EmployeeSalary s = salaryRepository.findById(Integer.parseInt(id)).orElse(null);
			l.info("Salary returned : " +s);
			return s;
	
		}
		

	/*	@Override
		public List<EmployeeSalary> fichedepaie(int User_ID) {
			 List<EmployeeSalary> fiches =salaryRepository.fichedepaie(User_ID);
				return fiches;
		}
		public void generateCsvResponse(HttpServletResponse response) throws IOException {
			CSVPrinter csvPrinter = null;
			  String filename = "EmployeeSalary.csv";
			 // List<Bill> bills = (List<Bill>) billRepository.findAll();
			  List<EmployeeSalary> commands = (List<EmployeeSalary>) salaryRepository.findAll();
			  try {
			     response.setContentType("text/csv");
			     response.setHeader(HttpHeaders.CONTENT_DISPOSITION,
			              "attachment; filename=\"" + filename + "\"");
			      csvPrinter = new CSVPrinter(response.getWriter(),
			     CSVFormat.DEFAULT.withHeader(" Salary_ID ", " Month ", " Year "," Work_hours  ","Extra_hours","Salary"));
			     for (EmployeeSalary command : commands) {
			       csvPrinter.printRecord(Arrays.asList(command.getSalary_ID(),command.getMonth(),command.getYear(), command.getWork_hours(), command.getExtra_hours(), command.getSalary()));
			     }
			   
			     } catch (IOException e) {
			       e.printStackTrace();
			      }finally {
			          if(csvPrinter != null)
			              csvPrinter.close();
			                   }
			       
		
		@Override
		public void affecterSalaryToUser(int idp, int id) {
		EmployeeSalary employeeSalary = salaryRepository.findById(idp).get();
		User user = userRepository.findById(id).get();
		if (!ObjectUtils.isEmpty(employeeSalary) && !ObjectUtils.isEmpty(user))
			employeeSalary.setUser(user);
			userRepository.save(user);
		}
		
		 public int salary()
		    {
		    	return salaryRepository.salary();
		    }
		 
		 
		 //best employee
		 @Override
		 public List<?> BestEmployee() {


		 return salaryRepository.BestEmployee();

		 }

		@Override
		public List<EmployeeSalary> fichedepaie(int User_ID) {
			// TODO Auto-generated method stub
			return null;
		}

	}
	
	

package projetIMAFA.service;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import tn.esprit.spring.entity.Payment;
import projetIMAFA.entity.*;
import projetIMAFA.repo.EmployeeSalaryRepository;
import projetIMAFA.repo.UserRepository;

	
	@Service
	public class EmployeeSalaryServiceImpl implements IEmployeeSalaryService{
		@Autowired
		EmployeeSalaryRepository salaryRepository;
		@Autowired
		UserRepository userRepository;
		private static final Logger l = LogManager.getLogger(EmployeeSalaryServiceImpl.class);
	
		public List<EmployeeSalary> retrieveAllSalaries() {
			List<EmployeeSalary> salaries = (List<EmployeeSalary>) salaryRepository.findAll();
			for(EmployeeSalary salary : salaries)
			{
				l.info("salary ++ :"+salary);
			}
			return salaries;
	
		}
	
		public EmployeeSalary addSalary(EmployeeSalary s) {
			EmployeeSalary employeeSalarySaved = null;
			employeeSalarySaved=salaryRepository.save(s);
			return employeeSalarySaved;
	
		}
	
		public void deleteSalary(String id) {
			salaryRepository.deleteById(Integer.parseInt(id));
	
		}
	
		public EmployeeSalary updateSalary(EmployeeSalary s) {
			EmployeeSalary employeeSalaryAdded = salaryRepository.save(s);
			return employeeSalaryAdded;
		}
	
		public EmployeeSalary retrieveSalary(String id) {
	
			l.info("in retrieveSalary id= "+id);
			EmployeeSalary s = salaryRepository.findById(Integer.parseInt(id)).orElse(null);
			l.info("Salary returned : " +s);
			return s;
	
		}
		
		

		@Override
		public List<EmployeeSalary> fichedepaie(int User_ID) {
			 List<EmployeeSalary> fiches =salaryRepository.fichedepaie(User_ID);
				return fiches;
		}
		public void generateCsvResponse(HttpServletResponse response) throws IOException {
			CSVPrinter csvPrinter = null;
			  String filename = "EmployeeSalary.csv";
			 // List<Bill> bills = (List<Bill>) billRepository.findAll();
			  List<EmployeeSalary> commands = (List<EmployeeSalary>) salaryRepository.findAll();
			  try {
			     response.setContentType("text/csv");
			     response.setHeader(HttpHeaders.CONTENT_DISPOSITION,
			              "attachment; filename=\"" + filename + "\"");
			      csvPrinter = new CSVPrinter(response.getWriter(),
			     CSVFormat.DEFAULT.withHeader(" Salary_ID ", " Month ", " Year "," Work_hours  ","Extra_hours","Salary"));
			     for (EmployeeSalary command : commands) {
			       csvPrinter.printRecord(Arrays.asList(command.getSalary_ID(),command.getMonth(),command.getYear(), command.getWork_hours(), command.getExtra_hours(), command.getSalary()));
			     }
			   
			     } catch (IOException e) {
			       e.printStackTrace();
			      }finally {
			          if(csvPrinter != null)
			              csvPrinter.close();
			                   }
			       
		
		@Override
		public void affecterSalaryToUser(int idp, int id) {
		EmployeeSalary employeeSalary = salaryRepository.findById(idp).get();
		User user = userRepository.findById(id).get();
		if (!ObjectUtils.isEmpty(employeeSalary) && !ObjectUtils.isEmpty(user))
			employeeSalary.setUser(user);
			userRepository.save(user);
		}
		
		 public int salary()
		    {
		    	return salaryRepository.salary();
		    }
		 
		 
		 //best employee
		 @Override
		 public List<?> BestEmployee() {


		 return salaryRepository.BestEmployee();

		 }

		@Override
		public List<EmployeeSalary> fichedepaie(int User_ID) {
			// TODO Auto-generated method stub
			return null;
		}

	}
	
	*/

