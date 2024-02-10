package in.company.dev.Main;

import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.company.dev.Data.Employee;
import in.company.dev.Resources.JavaConfigFile;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigFile.class);

		
		Employee emp = (Employee) context.getBean("employee");
		
		System.out.println(emp);
		

	}

}
