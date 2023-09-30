package interfaces;

public class DefaultInterfaceMain implements DefaultInterface {

	public static void main(String[] args) {
		DefaultInterfaceMain v=new DefaultInterfaceMain();
		System.out.println(v.add(20,30));
		DefaultInterface.adds(50,60);
		v.show();
		
	}
	
	@Override
	public int add(int m, int n) {
		return m+n;
	}
}
