package com.bridzelab.LineComparisionProblem;
import java.util.Scanner;

public class LineComparisionProblem {
	
   	public static void main(String[] args) {
		 int x1, x2, y1, y2, a1, a2, b1, b2;
	        double length1, length2;
		System.out.println("Welcome to Line Comparison Program in java");
		//Scanner Object for User Input
	    Scanner sc=new Scanner(System.in);
	    System.out.println("*****************************************");
		System.out.println("enter x1 point");
		x1=sc.nextInt();
		System.out.println("enter y1 point");
		y1=sc.nextInt();
		System.out.println("enter x2 point");
		x2=sc.nextInt();
		System.out.println("enter y2 point");
		y2=sc.nextInt();
		 length1= Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		System.out.println("Length of the line:" + length1);
		 System.out.println("*****************************************");
		System.out.println("enter a1 point");
		a1=sc.nextInt();
		System.out.println("enter b1 point");
		b1=sc.nextInt();
		System.out.println("enter a2 point");
		a2=sc.nextInt();
		System.out.println("enter b2 point");
		b2=sc.nextInt();

       length2 = Math.sqrt(Math.pow((a2-a1),2)+Math.pow((b2-b1),2));
        
		System.out.println("Length of the line:" + length2);
		String str1 = Double.toString(length1);
        String str2 = Double.toString(length2);
        if (str1.equals(str2))
            System.out.println("The two lines are equal");
        else
            System.out.println("The two lines are not equal");
        sc.close();

    }
}