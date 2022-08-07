package com.bridzelab.LineComparisionProblem;
import java.util.Scanner;

public class LineComparisionProblem {
	//get variables
	int x1,x2,y1,y2;
   //Scanner Object for User Input
    Scanner sc=new Scanner(System.in);
	
	//method to get input from user
	public void getCooridinates()
	{
		System.out.println("Welcome to Line Comparison Program in java");

		System.out.println("enter x1 point");
		x1=sc.nextInt();
		System.out.println("enter y1 point");
		y1=sc.nextInt();
		System.out.println("enter x2 point");
		x2=sc.nextInt();
		System.out.println("enter y2 point");
		y2=sc.nextInt();
	}
	//method for calculating length of line
	public double getLengthOfLine()
    {
      double lengthOfLine = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        return lengthOfLine;
    }
	public static void main(String[] args) {
		LineComparisionProblem LC1 = new LineComparisionProblem();
		LineComparisionProblem LC2= new LineComparisionProblem();
		//geting input from the user
	        LC1.getCooridinates();
	        LC2.getCooridinates();
	        
	        double line1Length = LC1.getLengthOfLine();
	        double line2Length = LC2.getLengthOfLine();
	      //Displaying the Length of Lines
	        System.out.println("Length of Line1 : "+line1Length);
	        System.out.println("Length of Line2 : "+line2Length);

	      //Checking the Equality of Lines
	        if(line1Length == line2Length) {
	            System.out.println("Length of Line1 and Line2 are Equal");
	        } else {
	            System.out.println("Length of Line1 and Line2 are Not Equal");
	        }
	    }
	}