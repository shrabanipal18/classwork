package collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<String> stack=new Stack<>();
		LinkedList<String> names=new LinkedList<>();
		names.add("Bithi");
		names.add("Sushmita");
		names.add("Priya");
		names.add("Riya");
		names.add("Suparna");
		//stack.pop();
		//System.out.println(stack);
		for(String str:names)
		{
			System.out.println(str);
		}
		System.out.println("==============================================================================================");
		Iterator itr=names.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		names.addFirst("First");
		names.add("Last");
		names.add(2, "Shrabani");
		System.out.println(names);
		names.removeLast();
		names.removeFirst();
		System.out.println(names);
		names.remove(1);
		System.out.println(names);
		names.remove("Priya");
		System.out.println(names);
		
		ListIterator listitr=names.listIterator();
		System.out.println("Forward direction: ");
		while(listitr.hasNext())
		{
			System.out.println(listitr.next());
		}
		System.out.println("Backward direction: ");
		while(listitr.hasPrevious())
		{
			System.out.println(listitr.previous());
		}

	}

}
