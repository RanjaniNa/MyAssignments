package week1.day1;

public class Mobile {
	public void makeCall()
	{
		System.out.println("MakeCall method executed");
	}
	public void sendMsg()
	{
		System.out.println("SendMsg method executed");
	}
	
	public static void main(String[] args)
	{
		Mobile m=new Mobile();
		m.makeCall();
		m.sendMsg();
	}
}


