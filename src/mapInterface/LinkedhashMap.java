package mapInterface;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public class LinkedhashMap  {

	public static void main(String[] args) {
	Map<Integer,String> m=new LinkedHashMap<Integer, String>();
	m.put(101,"shanu");
	m.put(201,"vedha");
	m.put(301,"priya");
	m.put(401,"jaanu");
	m.put(501,"chinnu");
	m.put(601,"darling");
	System.out.println(m);
	Map<Integer,String> m2=Map.of(201,"Shannu",143,"vedhu",153,"priyanka");
	m.putAll(m2);
	System.out.println(m);
	System.out.println(m.size());
	System.out.println(m.entrySet());
	Set<Integer> k=m.keySet();
	Iterator<Integer> i=k.iterator();
	while(i.hasNext()) {
		System.out.println(i.next()+"\t"+m.get(i.next()));
	}
	}

}
