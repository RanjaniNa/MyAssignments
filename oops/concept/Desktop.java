package oops.concept;

public class Desktop extends Computer{

	public void desktopsize()
	{
		System.out.println("Desktop size:24'");
	}
	
	public static void main(String[] args) {
		Desktop obj=new Desktop();
		obj.computerModel();
		obj.desktopsize();
	
	}

}
