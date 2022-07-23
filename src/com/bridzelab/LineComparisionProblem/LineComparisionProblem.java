package com.bridzelab.LineComparisionProblem;
import java.util.Scanner;

public class LineComparisionProblem {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Program in java");

	      int x1,x2,y1,y2;
	      double distance;
	      Scanner sc=new Scanner(System.in);

	      System.out.println("enter x1,y1 point");
	      x1=sc.nextInt();
	      y1=sc.nextInt();
	      System.out.println("enter x2,y2 point");
	      x2=sc.nextInt();
	      y2=sc.nextInt();
	      distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
	      System.out.println("length of line is:"+distance);


	   }
	}
