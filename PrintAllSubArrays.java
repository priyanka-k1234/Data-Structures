package DataStructure;

public class PrintAllSubArrays {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		
	  for(int startIndex =0;startIndex<arr.length; startIndex++) {
		// System.out.print(arr[startIndex]);
		  for(int endIndex=startIndex;endIndex<arr.length;endIndex++) {
			//  System.out.print(arr[endIndex] + " ");
		  for(int k=startIndex;k<=endIndex;k++) {
			  System.out.print(arr[k] + " ");
		  }
	  
		  System.out.println(); 
	}

}
}}