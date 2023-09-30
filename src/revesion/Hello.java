package revesion;

public class Hello {

	public static void main(String[] args) {
		String s1="welcome";
		String s2="world";
		String uniqueChars="";
	
		for(int i=0; i<s1.length(); i++){
			String charact=""+s1.charAt(i);
			if(s2.contains(charact)) {
				s2=s2.replaceAll(charact,"");
			}else {
				uniqueChars+=charact;
			}
		}
		uniqueChars+=s2;
		System.out.println(uniqueChars);
	}
}
