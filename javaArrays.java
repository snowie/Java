package arrays;
import java.util.*;
public class arrayInputUser {
	public static void main(String []args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size : ");
		int size=sc.nextInt();
		System.out.print("Enter values : ");
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			 arr[i]= sc.nextInt();
		}
		System.out.print("Enter number to find in Array : ");
		int num= sc.nextInt();
	     for (int j=0;j<size;j++) {
	    	 if (arr[j]==num) {
	    	 System.out.println("Number found at Index : " + j);
	       }
	    }
   }
}


