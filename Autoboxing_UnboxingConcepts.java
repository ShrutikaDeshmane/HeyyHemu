package com.csi.core;

public class Autoboxing_UnboxingConcepts {
public static void main(String[] args) {
	int empId=123;
	Integer EmployeeID=empId;//autoboxing-:converting primitive value
	//into an object of the corresponding wrapper class.
	System.out.println("\n Employee ID is "+EmployeeID);
	
	Double pPRICE= 24.890;
	double productprice=pPRICE;//unboxing-:Converting an object of a wrapper class
	//to it's corresponding primitive vlue
	System.out.println("\n Product Price is "+productprice);
	
	long empContact= 34579826573887L;
	Long contact=empContact;
	System.out.println("\n Employee Contact: "+contact);
	
	Short empDress= 34;
	short dress= empDress;
	System.out.println("\n Employee dresses: "+dress);
	
	float age= (float) 25.08;
	Float EmpAge= age;
	System.out.println("\n Employee AGe is "+EmpAge);
	
}
}
