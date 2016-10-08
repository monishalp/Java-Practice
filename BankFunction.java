///////////////////////////////////////////////////////////////////////
// BankFunction.java                                                //
// version 1.0                                                       //
// Language:    Java                                                 //
// Platform:    Dell Precision T7400, Win7, SP1                      //
// Application: java Practice                                        // 
// Author:      Monisha Lakshmipathi                                 //
//              (315) 751-3191, mlakshmi@syr.edu                     //
///////////////////////////////////////////////////////////////////////
package PRAC;
import java.util.*;
class BankFunction
	{
	static int acc_no =6789; // account number is static so that it is valid throughout the program
	float amt;
	// display function
	public void display()
	{
		System.out.println("Account no :"+acc_no );
		System.out.println("Current Amount :"+amt );
	}
	
	public BankFunction()
	{
		amt=1000;
		System.out.println("Ur account no is "+acc_no);
		acc_no++;
}
public void getamt()
	{
	System.out.println("Current balance :"+amt);
	}
public void withdraw(float x)
	{
	if(amt==1000 || amt<=x )
	{
		System.out.println("Sorry u can't withdraw");
	}
else	
	{	
	amt=amt-x;
	System.out.println("amount withdrawn :"+x);
	System.out.println("After withdrawl");
	getamt();
	}
	}
	public void deposit(float x)
	{
		if(x==0.0)
			System.out.println("0 can't be deposited");
else 	{
	amt+=x;
	System.out.println("After deposition");
	getamt();}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		BankFunction b1 = new BankFunction();
	b1.deposit(0);
b1.withdraw(7654);
b1.display();
System.out.println("\n");
BankFunction b2 = new BankFunction();
b2.deposit(8765);
b2.withdraw(6789);
}
}