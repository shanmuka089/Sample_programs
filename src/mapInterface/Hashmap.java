package mapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(101,"Shannu");
		map.put(201,"vedhu");
		map.put(560,"jaanu");
		map.put(381,"chinnu");
		map.put(403,"darling");
		System.out.println(map);
		Set k=map.entrySet();
		Iterator i=k.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		
	}

}
