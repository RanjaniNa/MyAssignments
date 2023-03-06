package oops.assignment3;

public class AxisBank extends BankInfo{
	public void deposit()
	{
		System.out.println("deposit:9000");
	}

	public static void main(String[] args) {
AxisBank obj=new AxisBank();
obj.savings();
obj.fixed();
obj.deposit();

	}

}
