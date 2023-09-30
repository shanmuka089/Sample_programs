package arrays;

public class NonPrimitiveArray5 {

	public static void main(String[] args) {
		Object[] arr=new Object[4];
//		the array is created has object type whaich can hold any type of object.
//		in below lines it can automatically upcasting takes place because the reference allows only objects.
//		after upcasting we want to access that value we want to do downcasting manually to Respective wrapper type.
//		in wrapper classes boxing & unboxing automatically takes place.
		arr[0]=20;
		arr[1]=60;
		arr[2]=50;
		arr[3]=80;
		int sum=0;
		for(Object o: arr)
		{
//			down casting is done in below line.after down casting automatically unboxing takes place.
			sum+=(Integer)o;
		}
		System.out.println(sum);
	}

}
