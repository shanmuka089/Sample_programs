package shanmuka;
import java.util.HashSet;
import java.util.Set;

public class Exam2{
	public static void main(String[] args) {
		Set<String> s=new HashSet<String>();
	permute((734+""),0,2,s);
	s.stream().sorted().forEach(System.out::println);
	
	}
	public static void permute(String s,int start, int end,Set s2) {
		if(start==end) {
			s2.add(s);
			return;
		}
		for(int i=start; i<=end; i++) {
			String s1=swap(s,start,i);
			permute(s1, start+1, end,s2);
		}
	}
	public static String swap(String s,int i,int j) {
		char[] a=s.toCharArray();
		char temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		String s1=new String(a);
		return s1;
	}
}
