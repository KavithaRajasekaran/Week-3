package week3.day1.assignments;

public class Student_prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student_prog4 student=new Student_prog4();
		
		student.getStudentInfo(25);
		student.getStudentInfo(26, "Kavitha");
		student.getStudentInfo("Kavitha@gmail.com",258963478);
	}

	public void getStudentInfo(int id)
	{
		System.out.println("The Student ID is " +id);
	}
	
	public void getStudentInfo(int id, String name)
	{
		System.out.println("The Student ID is " +id +" and Student name is " +name);
	}
	
	public void getStudentInfo(String email, int phonenumber)
	{
		System.out.println("The Student email ID is " +email +" and Student phonenumber is " +phonenumber);
	}
	
	
	
}
