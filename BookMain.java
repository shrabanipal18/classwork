package array;
import java.util.*;
public class BookMain {

	public static void main(String[] args) {
		int ch;
		Scanner sc=new Scanner(System.in);
		BookService bservice=new BookService();
		System.out.println("Welcome to Book Management System");
		do {
			System.out.println("1.createBook\n2.getBookById\n3.getAllBook\n4.exit");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				bservice.createBook();
				break;
			case 2:
				BookService.searchById();
				break;
			case 3:
				BookService.getAllBookDetails();
				break;
			case 4:
				System.exit(0);
			}
			System.out.println("Thanks for visit us");
		}while(true);

	}

}
