package array;

public class StringDemo {

	public static void main(String[] args) {
//		String str1="computer";
//		String str2="computer";
//		String str3="com"+"puter";
//		System.out.println(str3);
//		String str4="Bond";
//		String str5="My name is "+str4;
//		System.out.println(str5);
//		String great="Good Morning";
//		char ch=great.charAt(-1); //String index out of range
//		System.out.println(ch);
//		String s1="hello";
//		String s2="hello";
//		String s3="meklo";
//		String s4="hmelo";
//		String s5="flag";
//		System.out.println(s1.compareTo(s3));
//		String str6=s1.concat(s2).concat(s3).concat(s4).concat(s5);
//		System.out.println(str6);
//		System.out.println(s5.isEmpty());
		String name="good morning";
		System.out.println(name.startsWith("bad"));
		System.out.println(name.indexOf('o'));
		String str7=new String("Welcome");
		String str8=new String("Welcome");
		System.out.println(str7==str8);
		StringBuilder builder=new StringBuilder("Hello world, ");
		System.out.println(builder);
		builder.append("I am a learning String");
		System.out.println(builder);
		builder.reverse();
		System.out.println(builder);
		builder.insert(24,"java ");
		System.out.println(builder);
		builder.insert(0, "Hi");
		System.out.println(builder);
		builder.replace(29, 33, "python");
		System.out.println(builder);
		builder.delete(29, 36);
		System.out.println(builder);
		StringBuffer buffer=new StringBuffer("Hello Java");
		buffer.append(" World");
		System.out.println(buffer);
		System.out.println(buffer.capacity());
		System.out.println(buffer.charAt(4));
		System.out.println(buffer.indexOf("ello"));
		System.out.println(buffer.substring(6));
		System.out.println(buffer.substring(6, 10));
		System.out.println(buffer.deleteCharAt(5));
	}

}
