package week3.day1.assignments;

public class Student_prog2 extends Department_prog2{
	
	public static void main(String[] args) {
		
		Student_prog2 Student = new Student_prog2();
		
		Student.collegeName("Anna University");
		Student.collegeCode(156);
		Student.collegeRank(10);
		Student.Deptname("Computer");
		Student.studentName("Kavitha");
		Student.studentdeptName("computer science");
		Student.studentID(165239);
		
		
	}
	
	public void studentName(String studname)
	{
		System.out.println(studname);
		
	}
	
	public void studentdeptName(String studdeptname)
	{
		System.out.println(studdeptname);
		
	}
	
	public void studentID(Integer stuID)
	{
		System.out.println(stuID);
		
	}

}
