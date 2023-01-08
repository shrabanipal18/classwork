package Exception;

public class FinallyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			try
			{
				int a=30,b=0;
				System.out.println(a/b);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			int arr[]=new int[5];
			arr[7]=5;
			System.out.println("Array element: "+arr[7]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bounds");
		}
		finally {
			System.out.println("Finally block always executed");
		}

	}

}
