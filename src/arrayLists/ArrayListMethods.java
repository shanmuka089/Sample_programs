package arrayLists;

public class ArrayListMethods {
//	declare array to store objects inside array.
	private Object[] arr;
	private int p;
//	create a constructor to create a object array when the arraylist is created & increase capacity method is called.
	ArrayListMethods()
	{
		arr=new Object[10];
		p=0;
	}
//	add method to add the objects inside the array.
	public void add(Object e)
	{
		if(p>=arr.length)increaseCapacity();
		arr[p++]=e;
	}
//	it is used to increase the capacity of array when the array is full.
	private void increaseCapacity()
	{
		Object[] temp=new Object[(arr.length*3/2)+1];
		for(int i=0; i<arr.length; i++)
			temp[i]=arr[i];
		arr=temp;
	}
//	it is used to know the capacity of the array.
	public int capacity()
	{
		return arr.length;
	}
//	it is used to clear the array.
	public void clear()
	{
		arr=new Object[10];
		p=0;
	}
//	it is used to know the length of the array.
	public int size()
	{
		return p;
	}
//	it is used to get the object.
	public Object get(int index)
	{
		if(index<=-1 || index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		return arr[index];
	}
//	it is used to remove the object at given index.
	public void remove(int index)
	{
		if(index<=-1 || index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		for(int i=index+1; i<size(); i++)
		{
			arr[i-1]=arr[i];
		}
		p--;
		arr[p]=null;
	}
//	it is use to add the object at requred index.
	public void add(int index,Object e)
	{
		if(index<=-1 || index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		if(p>=arr.length)increaseCapacity();
		for(int i=size()-1; i>=index; i--)
		{
			arr[i+1]=arr[i];
		}
		arr[index]=e;
	}
//	it is used to print the array of objects.
	@Override
	public String toString()
	{
		if(arr.length<0)return "[]";
		String s="["+arr[0];
		for(int i=1; i<arr.length; i++)
		{
			s+=", "+arr[i];
		}
		s+="]";
		return s;
	}
}
