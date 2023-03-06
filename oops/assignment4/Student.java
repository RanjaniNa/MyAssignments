package oops.assignment4;

public class Student {
	public void getstudentinfo(int id)
	{
		System.out.println(id);
	}
	public String getstudentinfo(String name)
	{
	return name;
	}
	public String getstudentinfo(String email,String phone)
	{
		return email+phone;
	}
	public static void main(String[] args) {
Student obj=new Student();
obj.getstudentinfo(300);
System.out.println(obj.getstudentinfo("dilip"));
System.out.println(obj.getstudentinfo("ranjani@test.com", "9876543210"));


	}

}
