package in.pvg.etc.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.pvg.etc.StudentsData.Student;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String location = "in/pvg/etc/resources/ApplicationContext.xml";
		
		ApplicationContext context = new ClassPathXmlApplicationContext(location);
		
		Student std1 = (Student) context.getBean("sID1");
		
		System.out.println(std1);
		System.out.println();
		
		Student std2 = (Student) context.getBean("sID2");
		
		System.out.println(std2);


	}

}
