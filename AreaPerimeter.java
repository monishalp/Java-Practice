///////////////////////////////////////////////////////////////////////
// AreaPerimeter.java                                                //
// version: 	 1.0                                                 //
// Language:    Java                                                 //
// Platform:    Dell Precision T7400, Win7, SP1                      //
// Application: Java Practice                                        // 
// Author:      Monisha Lakshmipathi                                 //
//              (315) 751-3191, mlakshmi@syr.edu                     //
///////////////////////////////////////////////////////////////////////
package PRAC;

import java.util.Scanner;

// abstract generic class shape
abstract class shape
{ 
int length;
int breadth;
shape(int length, int breadth)
{
this.length=length;
	this.breadth=breadth;
}
	abstract void display(); // abstract function
}


// interface measurement to calculate area and perimeter
	interface measuremnt
{
		int CalArea();
		int CalPerimeter();
}
	
	// Sqaure class extends shape and implements measurement
	class sqaure extends shape implements measuremnt
	{ 
		int area;
	int perimeter;
	sqaure(int length, int breadth)
	{
		super(length, breadth);
	}

	public int CalArea()
	{
		area = length * length;
		
		return area;
	}
	public int CalPerimeter()
	{
		perimeter = length * 4;
		
		return perimeter;
	}
	void display()
	{
	System.out.println("Each side of the square measures "+ length);

	System.out.println("area is "+CalArea());
	System.out.println("Perimeter is"+CalPerimeter());
	}
	}
	
	
	// rectangle class extends shape and implements measurement

	class rectangle extends shape implements measuremnt
	{ 
		int area;
	int perimeter;
	rectangle(int length, int breadth)
	{
		super(length, breadth);
	}

	public int CalArea()
	{
		area = length * breadth;
		
		return area;
	}
	public int CalPerimeter()
	{
		perimeter = (length + breadth) * 2;
		
		return perimeter;
	}
	void display()
	{
	System.out.println("length of the rectangle measures "+ length);
	System.out.println("breadth  of the rectangle measures "+ breadth);


	System.out.println("area is "+CalArea());
	System.out.println("Perimeter is"+CalPerimeter());
	}
	}
	
	
	
public class AreaPerimeter {
	public static void main(String args[])
	{ Scanner sc= new Scanner (System.in);
	System.out.println("Choose between Box or rectangle");
	int choice;
	System.out.println("1-box");
	System.out.println("2-rectangle");
	choice=sc.nextInt();
	int length, breadth;
	switch(choice)
	{
	case 1 :
	System.out.println("Enter the following for a box");
	System.out.print("length :");
	length=sc.nextInt();

	System.out.println("breadth :");
	breadth=sc.nextInt();

	
	sqaure boxObj = new sqaure(length, breadth);
	boxObj.display();
	break;
	case 2 :
		System.out.println("Enter the following for a reactangle");
		System.out.print("length :");
		length=sc.nextInt();

		System.out.println("breadth :");
		breadth=sc.nextInt();

		
		rectangle RectObj = new rectangle(length, breadth);
		RectObj.display();
		break;
	}
	}
}
