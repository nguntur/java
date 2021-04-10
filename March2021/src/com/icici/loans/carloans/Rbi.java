package com.icici.loans.carloans;

public interface Rbi
{		
	int x = 10; //property
		
		public void withdrawl(); // abstract method
		public void deposit();
		
		public static void main(String[] args) 
		{
			//Rbi i = new Rbi();
			
			Rbi i;
			i = new icici();
			i.deposit();
			i.withdrawl();
			
		    i=  new hdfc();
		    i.deposit();
		    i.withdrawl();
		
		}

    }
