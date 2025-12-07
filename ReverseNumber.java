package DataStructure;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n= scn.nextInt();
		int sum=0;
	//	int swap =n;
	  //  for(int i=1;i<=n;i++) {
	    //if()
			while (n>0) {
				int rem =n%10;
				sum = sum*10 +rem;
				n=n/10;
			}
			System.out.println(sum);
		} 
       
	}


