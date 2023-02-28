package week1.day2.assignments.mandatory;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
	String test="changeme";
	char[] c=test.toCharArray();
	for(int i=0; i<c.length;i++)
	{
		if(i%2!=1)
		{
			System.out.print(Character.toUpperCase(c[i]));
		}
		else
		{
			System.out.print(Character.toLowerCase(c[i]));
		}		
	}
	}
}
