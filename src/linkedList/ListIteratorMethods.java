package linkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorMethods {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(10);
		l.add("shanu");
		l.add("vedha");
		l.add(null);
		l.add('v');
		l.add(13.5);
		ListIterator ltr=l.listIterator();
		while(ltr.hasNext())	
		{
			System.out.print(ltr.next());
			System.out.print(" --> "+ltr.nextIndex()+",\t");
		}
		System.out.println();
		while(ltr.hasPrevious())
		{
			System.out.print(ltr.previous());
			System.out.print(" --> "+ltr.previousIndex()+",\t");
		}
		
		
	}

}
