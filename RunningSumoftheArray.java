package DataStructure;

import java.util.Scanner;

public class RunningSumoftheArray {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n= scn.nextInt();
		//input into array
		int[] arr =new int[n];
		 for(int i=0;i<arr.length; i++) {
			 arr[i]=scn.nextInt();
		 }
		
        // output of the array
		 //
	
	int[] result1=	RunningSumoftheArray(arr);{
			for(int i=0;i<arr.length; i++) {
			 System.out.print(result1[i] + " ");
			}
			 
			 }
		 }
		 

	private static int[] RunningSumoftheArray(int[] arr) {
		   
		

		    int sum = 0;   // running sum
		    int[] result =new int[arr.length];

		    for (int i = 0; i < arr.length; i++) {
		        sum = sum + arr[i];
		     //  System.out.print(sum + " ");
			 result[i] =sum;
		}
			return result;     

		
	}}
		 

