package day04.PackageB;
import day04.packageA.Program1;


public class Program3 extends Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addFunction_static(10, 20);
		mulFunction_static(20,10);
		//divFunction_static(20,10);
		Program3 x= new Program3();
		x.addFunction(10,20);
		x.mulFunction(20,10);

	}

}
