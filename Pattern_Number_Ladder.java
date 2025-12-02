package Patterns;

import java.util.Scanner;

public class Pattern_Number_Ladder {

	public static void main(String[] args) {
	
		        Scanner scn =new Scanner(System.in);
		        int n=scn.nextInt();
		        int row =1; int noofnumeric=1;int count=1;
		        while(row<=n){
		          for(int i=1; i<=noofnumeric;i++){
		        	  
		              System.out.print("  "+count);
		              count++;
		          }
		        System.out.println(  );
		        row++;
		        noofnumeric++;
		    }

}}
