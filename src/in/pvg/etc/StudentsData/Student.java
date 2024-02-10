package in.pvg.etc.StudentsData;

public class Student {
	private String name;
	private int RollNo;
	private String City;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", RollNo=" + RollNo + ", City=" + City + "]";
	}
	
	

}
