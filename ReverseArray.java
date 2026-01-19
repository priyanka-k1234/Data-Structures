package DataStructure;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int n= scn.nextInt();
		int arr[] =new int[n];
		for(int i=0;i<arr.length; i++) {
			arr[i]= scn.nextInt();
		//System.out.print(arr[i]+ " ");
		}

	reverse(arr);
	for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+ " ");}
	//	}
	}

	private static int[] reverse(int[] arr) {
		
	for(int i=0; i<arr.length/2; i++) {
          //for(int j=arr.length-1;j>0; j--) 
        	//  while(arr[0]==arr[arr.length-1]) {
        	int temp=arr[i];
        	arr[i]=arr[arr.length-1-i];
        	arr[arr.length-1-i] =temp;
        	 
        //	 System.out.print(arr[j]+ " ");
	}
		

	return arr;}}