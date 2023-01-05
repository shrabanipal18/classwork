package array;

import java.util.Scanner;

public class NegativeSearch {

	public static void main(String[] args) {
		int arr[]=new int[10];
		int c=0;
		System.out.println("Enter the number of elements: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter elements: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]<0)
			{
				System.out.println("The nagative element is: "+arr[i]);
				c++;
			}
		}
		if(c<1)
		{
			System.out.println("Negative element not found!");
		}

	}

}
