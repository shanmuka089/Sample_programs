package shanmuka;
public class Exam1 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=11; i<=21; i++) {
			String s=i+"";
			int count=s.length();
			if(count==3) {
			int m=i;
			int j=m%10;
			m/=10;
			int k=m%10;
			m/=10;
			int l=m%10;
			if(((j-k)==1||(j-k)==-1) && ((k-l)==1||(k-l)==-1))
				sum+=i;
			}else if(count==2) {
					int m=i;
					int j=m%10;
					m/=10;
					int k=m%10;
					if(((j-k)==1||(j-k)==-1))
						sum+=i;
			}
		}
		System.out.println(sum);
	}
}
