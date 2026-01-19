package DataStructure;

import java.util.Scanner;

public class MajorityElement {

	public static void main(String[] args) {
		
       Scanner scn=new Scanner(System.in);
       int n =scn.nextInt();
       int arr[] =new int[n];
      int totalnoOfelement=n;
     //input to array
       for(int i=0; i<arr.length; i++) {
			arr[i] =scn.nextInt();
       }
       
  int majaority=   MajorityElement(arr);
       //output of array
    
			System.out.println(majaority);}
    	   
	
	private static int MajorityElement(int[] arr) {
		   int n= arr.length;
		  
		   for(int i=0;i<arr.length; i++) {
			   int count=0;
			  for(int j=0;j<arr.length;j++) {
				
			    
					 if(arr[i]==arr[j] ) {
						  count++;
						  
				 
			    
					 }}if(count>n/2) {
						//System.out.println(arr[i]);
						return arr[i];
					 }
					 }
		 //  return -1;
	//	return -1;
		return n;
		
		   
	}
	}
		
	

