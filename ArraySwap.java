package DataStructure;

import java.util.Scanner;

public class ArraySwap {

	public static void main(String[] args) {
		//Scanner scn=new Scanner(System.in);
	    int arr[] = {10,20,40,24};
	    //int arr2[] = {20};
	  //  System.out.println(arr+"  " );
	    swap(arr[1],arr[2]);
		//for(int i=0; i<arr.length-1; i++) {
			System.out.println(arr[1] +" " + arr[2]);
			
		//}

}

	private static void swap(int  arr1, int arr2 ){
		
		int temp= arr1 ;
	     arr1 =arr2;
	   arr2 = temp;
	    System.out.println(arr1 +"  " + arr2);
		
	}

//	private static  swap(int[] arr, int[] arr2) {
//		
//		int temp[]= arr ;
//		arr= arr2;
//	    arr2= temp;
//		return  ;
		
		
		}

	
		
		
	