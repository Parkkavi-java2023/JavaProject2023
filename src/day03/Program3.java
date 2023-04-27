package day03;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program3 obj=new Program3();
int x=obj.addFunction(10,5);
System.out.println(x);
System.out.println(x*x);
int y=subFunction(10,5);
System.out.println(y);
System.out.println(y*y);
}

public  int addFunction(int a,int b)
{
	return a+b;
	
	}
public static int subFunction(int a,int b)
{
	return a-b;
	
	}

}
