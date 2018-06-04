package com.icici.loans.carloans;

public class SecondClass implements ThirdClass 
{
	int a=10,b=20,c=0;
	public void addition() {
		c=a+b;
		System.out.println("addition of a&b are:"+c);
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondClass obj=new SecondClass();
		obj.addition();
		obj.division();
		
	}





	@Override
	public void division() {
		// TODO Auto-generated method stub
		System.out.println("division overriding in ThirdClass");
		
	}

}
