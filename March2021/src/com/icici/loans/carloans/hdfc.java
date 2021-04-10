package com.icici.loans.carloans;

public class hdfc implements Rbi
{

	public static void main(String[] args) 
	{

		hdfc h = new hdfc();
		h.deposit();
		h.withdrawl();

	}

	@Override
	public void withdrawl()
	{
		System.out.println("I override withdrawl in HDFC");
	}

	@Override
	public void deposit()
	{
		System.out.println("I override deposit in hdfc");
		
	}

}
