package week1.day1;

public class ConvertANegativeNumberToPositiveNumber {

	public static void main(String[] args) {
	int num= -5;
	if(num>0)
	{
		System.out.println("Number is Positive");
	}
	else
	{
		int a = num * (-1);
		System.out.println("Positive Num=" + a);
	}

	}

}
