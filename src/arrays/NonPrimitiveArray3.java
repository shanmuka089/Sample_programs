package arrays;
public class NonPrimitiveArray3 {
	public static void main(String[] args) {
		Object[] o=new Object[5];
		o[0]=10;
		o[1]=20.8;
		o[2]=true;
		o[3]='b';
		o[4]="shanu";
		for(Object a: o) {
//			in below line println() method call to toString method.
//			the toString method can be Overridden by  respective classes.
//			so the calling of toString method can be depends on instance type.
			System.out.println(a);
		}
	}

}
