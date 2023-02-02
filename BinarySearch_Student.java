package dxc;

import java.util.Scanner;

/*
 * Write a program to accept the year of graduation from school as an integer value from the 
user. Using the Binary Search technique on the sorted array of integers given below, output 
the message ‘Record exists’ if the value input is located in the array. If not, output the message 
Record does not exist”.
(1982, 1987, 1993. 1996, 1999, 2003, 2006, 2007, 2009, 2010)
 */
public class BinarySearch_Student {

	public static void main(String[] args) {
		

		 int n[] = {1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010};
	        Scanner sc=new Scanner(System.in);
	        System.out.print("Enter graduation year to search: ");
	        int year = sc.nextInt();
	        
	        int start= 0, end = n.length - 1, idx = -1;
	        while (start<= end) {
	            int m = (start + end) / 2;
	            if (n[m] == year) {
	                idx = m;
	                break;
	            }
	            else if (n[m] < year) {
	                start= m + 1;
	            }
	            else {
	                end = m - 1;
	            }
	        }
	        
	        if (idx == -1)
	            System.out.println("Record does not exist");
	        else
	            System.out.println("Record exists");
	        
	        
	        
	        /*
	         * Define a class to accept and store 10 strings into the array and print the strings with even 
number of characters
	         */
	    
		Scanner scan=new Scanner(System.in);
		String[] strarr=new String[10];
		System.out.println("Enter Strings");
		for(int i=0;i<10;i++)
		{
			strarr[i]=scan.next();	
		}
		for(int i=0;i<10;i++)
		{
			if(strarr[i].length()%2==0)
			{
				System.out.println(strarr[i]+" ");
			}
		}
	}

}
