package DataStructure;

import java.util.Scanner;

public class SortJustZerosOne {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		int size=scn.nextInt();
		int arr[] =new int[size];
	//System.out.println(arr);
		for(int i=0; i<arr.length; i++) {
			arr[i] =scn.nextInt();
		//System.out.println(arr[i]+ " ");
		}
			
			
    	   SortJustZerosOne(arr);
    	   for(int i=0;i<=arr.length-1; i++) {
   			System.out.print(arr[i] + "  ");
   		 
    	   }}
 
    	   
       
       
       
	private static void SortJustZerosOne(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1;  j<arr.length;j++) {
				if(arr[i]>arr[j]) {
				int temp= arr[i];
				 arr[i]= arr[j];
				 arr[j]=temp;
				 
		}
				 
				 
			 
			
			 }
		 
}}}
