package com.icici.loans.carloans;

public class icici implements Rbi
{

	public static void main(String[] args) 
	{
		icici i = new icici();
		i.deposit();
		i.withdrawl();
	}

	@Override
	public void withdrawl() 
	{
		System.out.println("I override withdrawl in icici");
		
	}

	@Override
	public void deposit() 
	{
		System.out.println("I override deposit in icici");
		
	}

}
