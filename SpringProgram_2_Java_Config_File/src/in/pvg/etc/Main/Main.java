package in.pvg.etc.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.pvg.etc.StudentsData.Student;
import in.pvg.etc.resources.javaConfigFile;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new AnnotationConfigApplicationContext(javaConfigFile.class);
		
		Student std = (Student) context.getBean("stdID1");
		System.out.println(std);
		
		Student std2 = (Student) context.getBean("stdID2");
		System.out.println(std2);
		
		
		

	}

}
