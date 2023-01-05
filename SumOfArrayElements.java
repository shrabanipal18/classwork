/*
 * @author Shrabani Pal
 * 
 * Find the sum of array elements
 */
package array;
import java.util.Scanner;
public class SumOfArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[10];
		int s=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n=sc.nextInt();
		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			s=s+arr[i];
		}
		System.out.println("Sum of array elements is: "+s);

	}

}
