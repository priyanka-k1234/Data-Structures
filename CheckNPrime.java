package DataStructure;

public class CheckNPrime {

	public static void main(String[] args) {
		 for(int num=2;num<1000;num++) {
			   boolean aftercheck= CheckNPrime(num);
			  
			  
			   if(aftercheck==true) {
				   System.out.println(num);
				   
			  
			    

			}}
			}
			private static boolean CheckNPrime(int num) {
				
				//int count=0;
				
				for(int i=2; i<num;i++) {
					if(num%i==0) {
						return false ;
					
				
				
				
				}}
				return true;

	}

}
