package DataStructure;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
	  // Scanner scn= new Scanner(System.in);
		
		int arr[] = {1,2,-3,4,-5 ,9, 11 ,12};
	//	for(int i=0;i<arr.length;i++) ;
		//System.out.print(arr[i] + " ");
		
		
		
		int target=13;
	int ans=ls(arr,target);
	  if(ans!=-1) {
		System.out.print(ans);
	  
		}else {
			System.out.print("element not found");
		}}
	

	private static int ls(int[] arr, int target) {
		
		for(int i=0; i<arr.length; i++) {
		
			if(arr[i]==target) {
				
			//	System.out.println(arr[i] + " ");
				return  i;
	
		

		}
		
		}return -1;}}
