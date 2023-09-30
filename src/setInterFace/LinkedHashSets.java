package setInterFace;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSets {

	public static void main(String[] args) {
		Set<String> s=new LinkedHashSet<String>();
		s.add("a");
		s.add("b");
		s.add("c");
		s.add("d");
		s.add("a");
		s.add("c");
		System.out.println(s);
		
	}

}
