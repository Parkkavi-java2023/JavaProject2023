package Day08;
import java.util.Scanner;
class Program6 {

	public static void main(String[] args) 
	{
System.out.println("Start Program");
Scanner scan=new Scanner(System.in);
System.out.println("Enter vaue of a:");
int a = scan.nextInt();
scan.close();
if(a%2==0)
{
	System.out.println("a is even");
}

else
{
	System.out.println("a is odd");
}
}
}