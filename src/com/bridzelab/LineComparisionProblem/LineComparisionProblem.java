package com.bridzelab.LineComparisionProblem;
import java.util.Scanner;

public class LineComparisionProblem {

	   public static void main(String[] args) {

	      System.out.println("Welcome to Line Comparison Program on Master Branch");

	      int x1,x2,y1,y2;
	      int a1,a2,b1,b2;
	      double distance1, distance2;
	      Scanner scan = new Scanner(System.in);

	      System.out.println("enter x1 point");
	      x1=scan.nextInt();
	      System.out.println("enter y1 point");
	      y1=scan.nextInt();
	      System.out.println("enter x2 point");
	      x2=scan.nextInt();
	      System.out.println("enter y2 point");
	      y2=scan.nextInt();
	      distance1 = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
	      System.out.println("distance between" + "("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+distance1);


	      System.out.println("enter a1 point");
	      a1=scan.nextInt();
	      System.out.println("enter b1 point");
	      b1=scan.nextInt();
	      System.out.println("enter a2 point");
	      a2=scan.nextInt();
	      System.out.println("enter b2 point");
	      b2=scan.nextInt();
	      distance2 = Math.sqrt((a2-a1)*(a2-a1) + (b2-b1)*(b2-b1));
	      System.out.println("distance between" + "("+a1+","+b1+"),"+"("+a2+","+b2+")===>"+distance2);


	      String s1, s2;
	      s1 = Double.toString(distance1);
	      s2 = Double.toString(distance2);
	      System.out.println(distance1 = (distance2));

	   }
	}