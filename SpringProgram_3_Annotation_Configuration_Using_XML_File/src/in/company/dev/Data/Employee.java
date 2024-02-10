package in.company.dev.Data;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Value("Ravi")
	private String Name;
	
	@Value("100000")
	private int Salary;
	
	@Value("Pune")
	private String City;
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
	
	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", Salary=" + Salary + ", City=" + City + "]";
	}
	
	
}
