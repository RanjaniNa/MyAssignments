package week1.day1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
	int fnum=0;
	int snum=1;
	int range=8;
	
	for(int i=1;i<=range;i++)
	{
		System.out.println(fnum);
		int sum=fnum+snum;
		fnum=snum;
		snum=sum;
		
	}
	}
}
