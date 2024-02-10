package in.company.dev.Main;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.company.dev.Data.Employee;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Configuration_Path = "/in/company/dev/Resources/ApplicationContext.xml";
		
		ApplicationContext context = new ClassPathXmlApplicationContext(Configuration_Path);
		
		Employee emp = (Employee) context.getBean("employee");
		
		System.out.println(emp);
		

	}

}
