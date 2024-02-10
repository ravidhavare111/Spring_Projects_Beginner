package in.pvg.etc.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.pvg.etc.StudentsData.Student;

@Configuration
public class javaConfigFile {
	
	@Bean
	public Student stdID1(){
		Student std = new Student();
		std.setName("Ravi");
		std.setRollNo(101);
		std.setEmail("ravidhavare111@gmail.com");
		return std;
	}
	
	
	@Bean
	public Student stdID2(){
		Student std = new Student();
		std.setName("XYZ");
		std.setRollNo(112);
		std.setEmail("XYZ@gmail.com");
		return std;
	}
	
	

}
