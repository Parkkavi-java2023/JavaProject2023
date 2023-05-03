package day04.packageA;

public class Program2 extends Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addFunction_static(10, 20);
		//subFunction_static(30,10);
		mulFunction_static(20,10);
		divFunction_static(20,10);
		Program2 x= new Program2();
		x.addFunction(10, 20);
		x.mulFunction(20, 10);
		x.divFunction(30,10);
		//x.subFunction(30,10)

	}

}
