package com.icici.loans.carloans;

public class ThirdClass
{

	int a=10,b=20, result; //Properties
		
			public void add()
			{
			result =a+b;
			System.out.println("Addition of A & B is :"+ result);
			}	
	public void sub()
	{
		result = a-b;
		System.out.println("substraction of A & B is " + result);
	}
	public static void main(String[] args)
	{
		
		ThirdClass obj = new ThirdClass();
	    obj.add();
		obj.sub();
		
		
	}
    }
