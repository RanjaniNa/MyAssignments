package javatutorial;

public class Car {

		public void driveCar()
		{
			System.out.println("DriveCar method executed");
		}

		public void applyBrake()
		{
			System.out.println("ApplyBrake method executed");
		}
		public void soundHorn()
		{
			System.out.println("SoundHorn method executed");
		}
		public void isPuncture()
		{
			System.out.println("IsPuncture method executed");
		}
	

public static void main(String[] args)
{
	Car c=new Car();
	c.driveCar();
	c.applyBrake();
	c.soundHorn();
	c.isPuncture();
}
}

