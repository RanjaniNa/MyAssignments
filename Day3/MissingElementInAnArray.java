package week1.day2.classroom.arrays;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
    int arr[]= {1,2,3,4,7,6,8};
    Arrays.sort(arr);
for(int i=1;i<arr.length-1;i++)
{
	if(arr[i-1]!=i)
	{
		System.out.println(i);
	}
}
	}

}
