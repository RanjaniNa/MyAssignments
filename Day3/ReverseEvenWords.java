package week1.day2.assignments.mandatory;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test="I am a software tester";
		String[] s=test.split(" ");
		for(int i=0; i<=s.length-1;i++)
		{

			if(i%2==1)
			{
			System.out.print(s[i]+" ");	
			}
			else
			{
				char[] c=s[i].toCharArray();
				for(int j=c.length-1; j>=0;j--)
				{
					System.out.print(c[j]+" ");			}
			}
		}

	}

}
