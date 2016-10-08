///////////////////////////////////////////////////////////////////////
// BinToDec.java                                                     //
// version:     1.0                                                  //
// Language:    Java                                                 //
// Platform:    Dell Precision T7400, Win7, SP1                      //
// Application: Java Practice                                        // 
// Author:      Monisha Lakshmipathi                                 //
//              (315) 751-3191, mlakshmi@syr.edu                     //
///////////////////////////////////////////////////////////////////////
package PRAC;

public class BinToDec {

	public static void main(String args[])
	{
		String s = "0";
		int n = 5432;
s =Integer.toBinaryString(n);
System.out.println("Binary Equivalent is "+s);

n = Integer.parseInt(s,2); 
System.out.println("Decimal Equivalent is "+n);

	}
	
	
}

//Integer.toBinaryString()
// int decimalValue = Integer.parseInt(c, 2);
