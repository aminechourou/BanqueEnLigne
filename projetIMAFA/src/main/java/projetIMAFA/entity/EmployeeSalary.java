package projetIMAFA.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import projetIMAFA.entity.*;

@Entity
public class EmployeeSalary {

	private static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)

		private int Salary_ID;
		private int Month;
		private int Year;	
		private int Work_hours;
		private int Extra_hours;
		private float salary;
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
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		@Override
		public String toString() {
			return "EmployeeSalary [Salary_ID=" + Salary_ID + ", Month=" + Month + ", Year=" + Year + ", Work_hours="
					+ Work_hours + ", Extra_hours=" + Extra_hours + ", salary=" + salary + ", User=" + User + "]";
		}

		
		public EmployeeSalary(int salary_ID, int month, int year, int work_hours, int extra_hours, float salary,
				projetIMAFA.entity.User user) {
			super();
			Salary_ID = salary_ID;
			Month = month;
			Year = year;
			Work_hours = work_hours;
			Extra_hours = extra_hours;
			this.salary = salary;
			User = user;
		}
		public EmployeeSalary(int month, int year, int work_hours, int extra_hours, float salary) {
			super();
			Month = month;
			Year = year;
			Work_hours = work_hours;
			Extra_hours = extra_hours;
			this.salary = salary;
		}
		public EmployeeSalary() {
			super();
		}
		
		@OneToOne
		private User User;
		
		public User getUser() {
			return User;
		}
		public void setUser(User User) {
			this.User = User;
		}
		public EmployeeSalary(int month, int year, int work_hours, int extra_hours, float salary, User User) {
			super();
			Month = month;
			Year = year;
			Work_hours = work_hours;
			Extra_hours = extra_hours;
			this.salary = salary;
			this.User = User;
		}

		
}
