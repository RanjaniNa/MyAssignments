package oops.assignment2;

public class Student extends Department{
public void studentname()
{
	System.out.println("Name: Ranjani");
}
public void studentdept()
{
	System.out.println("dept:IT");
}
public void studentid()
{
	System.out.println("ID:1234");
}

	public static void main(String[] args) {
		Student obj=new Student();
		obj.collegename();
		obj.collegcode();
		obj.collagerank();
		obj.deptname();
		obj.studentdept();
		obj.studentid();
		obj.studentname();

	}

}
