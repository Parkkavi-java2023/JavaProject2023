package day05;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(3d,2l); //d,d
		  add(5,2f);// f,f
		  add(2f,2l); //f,f
		  add(3d,6f);// d,d
	}
	public static void add(byte a,byte b)
	{
		System.out.println(a*b);
	}
	
	public static void add(short a,short b)
	{
		System.out.println(a+a);
	}
	
	public static void add(int a,int b)
	{
		System.out.println(a-b);
	}
	public static void add(long a,long b)
	{
		System.out.println(a+b+b);
	}	
	
	public static void add(float a,float b)
	{
		System.out.println(a+a+b);
	}
	
	public static void add(double a,double b)
	{
		System.out.println(a+b);
	}

}
