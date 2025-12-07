package DataStructure;

import java.util.Scanner;

public class SwapNum {

	public static void main(String[] args) {
		//Scanner scn =new Scanner(System.in);
		int a=10;
		int b= 20;
		System.out.println(a +"  " +b);
         swap(a,b);
         System.out.println(a +"  " +b);
		

	}

	private static void swap(int a, int b) {
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a +"  " +b);
		
		
	}

}
