package java8;
interface Anonnymus{
	String msg(String message);
}
public class AnnonymusDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anonnymus s1=message->{
			return "Hello World. "+message;
		};
		System.out.println(s1.msg("Hello! What are you doing?"));

	}

}
