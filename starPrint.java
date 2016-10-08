///////////////////////////////////////////////////////////////////////
// PrintStar.java                                               //
// version 1.0                                                       //
// Language:    Java                                                 //
// Platform:    Dell Precision T7400, Win7, SP1                      //
// Application: Java Practice                                        // 
// Author:      Monisha Lakshmipathi                                 //
//              (315) 751-3191, mlakshmi@syr.edu                     //
///////////////////////////////////////////////////////////////////////
package PRAC;

class starPrint 
{
public static void main(String[] args) 
{
int i, j, k;
for(i=1;i<=3;i++)
{
for(j=i;j<3;j++)
{
System.out.print(" ");
}
for(k=1;k<(i*2);k++)
{
System.out.print("*");
}
System.out.println();
}
for(i=2;i>=1;i--)
{
for(j=3;j>i;j--)
{
System.out.print(" ");
}
for(k=1;k<(i*2);k++)
{
System.out.print("*");
}
System.out.println();
}
}
}