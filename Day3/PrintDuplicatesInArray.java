package week1.day2.classroom.arrays;

import java.util.Arrays;

public class PrintDuplicatesInArray {
	public static void main(String[] args) {
		int[] input= {2,5,3,1,4,5,7,6,3,2};
		Arrays.sort(input);
		for(int i=0; i<=input.length-1;i++)
{
		if(input[i]==input[i+1])
		{
			System.out.println(input[i]);
}
}}
}
