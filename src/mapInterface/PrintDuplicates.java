package mapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {
	String[] s= {"car","bus","van","bike","car","bus","van","boat","car"};
	Map<String, Integer> m=new HashMap<String, Integer>();
	for(int i=0; i<s.length; i++) {
		if(m.containsKey(s[i])) {
			int count=m.get(s[i]);
			count++;
			m.put(s[i],count);
		}else {
			m.put(s[i],1);
		}
	}
	System.out.println(m);
	Set<String> r=m.keySet();
	for(String l:r) {
		if(m.get(l)>1) {
			System.out.println(l);
		}
	}
	
	}

}
