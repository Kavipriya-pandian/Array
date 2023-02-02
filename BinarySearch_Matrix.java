package dxc;

import java.util.Scanner;

/*
 * Write a program to read in a 5×5 matrix and then ask for an input of a number and search 
its position in the matrix. If found, print the indices where it is found, otherwise print “Not 
Found”.
 */

public class BinarySearch_Matrix {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	       int a[][]=new int[5][5],i,j,f=0,n;
	       System.out.println("Enter 25 numbers:");
	       
	       for(i=0;i<5;i++)
	        {
	        for(j=0;j<5;j++)
	        {
	        a[i][j]=sc.nextInt();
	        }
	        }
	        System.out.println("Enter the number to search:");
	        n=sc.nextInt();
	        for(i=0;i<5;i++)
	        {
	        for(j=0;j<5;j++)
	        {
	        if(a[i][j]==n)
	 {
	 System.out.println("Position present at i=" +i + " j="+j);
	 f=1;
	 }
	 }
	 }
	if(f==0)
	 System.out.println("Not Found");
	 

		
		
}
}
