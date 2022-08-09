package com.bridzelab.LineComparisionProblem;
import java.util.Scanner;

public class LineComparisionProblem 
{
	
	  static int x1, x2, y1, y2, a1, a2, b1, b2;
	    static String str1, str2;
	    static double length1, length2;
	    public static void length1() 
	    {
	        System.out.println("Welcome to Line Comparison Computation Program");

	        Scanner sc = new Scanner(System.in);
	        System.out.println("*****************************");
	        System.out.println("Enter first two co-ordinates:");
	        x1 = sc.nextInt();
	        y1 = sc.nextInt();
	        System.out.println("Enter second two co-ordinates:");
	        x2 = sc.nextInt();
	        y2 = sc.nextInt();
	        length1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
	        System.out.println("Length of the line:" + length1);
	        str1 = Double.toString(length1);
	    }

	    public static void length2()
	    {

	        Scanner sc = new Scanner(System.in);
	        System.out.println("*****************************");
	        System.out.println("Enter third co-ordinates:");
	        a1 = sc.nextInt();
	        b1 = sc.nextInt();
	        System.out.println("Enter fourth co-ordinates:");
	        a2 = sc.nextInt();
	        b2 = sc.nextInt();
	        length2 = Math.sqrt(Math.pow((b2 - b1), 2) + Math.pow((a2 - a1), 2));
	        System.out.println("Length of the line:" + length2);
	        str2 = Double.toString(length2);
	    }
	    public double checkComputeToMethod()
	    {
	        System.out.println("\n * Check with Equal Method");
	        double check = str1.compareTo(str2);
	        if (check == 0)
	            System.out.println("The two lines are equal\n");
	        else if (check < 0.0)
	            System.out.println("Line1 is smaller than Line2\n");
	        else
	            System.out.println("Line1 is greater than Line2\n");
	        return( check);
	    }
	   public void checkEqualMethod()
	   {
	       System.out.println("* Check with Equal Method");
	       if (str1.equals(str2)) 
	       {   // Check the Lines are equal or not
	           System.out.println("Two Lines are Equals");
	       }
	       else
	           System.out.println("Two Lines are Not Equals\n");
	   }
	    public static void main(String[] args)
	    {
	    	LineComparisionProblem l1=new LineComparisionProblem();
	        length1();
	        length2();
	       l1.checkComputeToMethod();
	        l1.checkEqualMethod();
	    }
	}