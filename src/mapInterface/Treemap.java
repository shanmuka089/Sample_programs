package mapInterface;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		Map<Integer,String> m=new TreeMap<Integer, String>();
		m.put(809,"acnoi");
		m.put(494,"ajshivb");
		m.put(789,"aovopa");
		m.put(741,"ajvhio");
		m.put(963,"canvbo");
		Set k=m.keySet();
		for(Object l : k) 
		{
			System.out.println(l+"\t"+m.get(l));
		}
		
	}

}
