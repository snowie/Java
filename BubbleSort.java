package arrays;
import java.util.*;
public class bubbleSort {
	public static void printArray(int arr[]) {
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+ " ");
		}	
	}
	//bubbleSort

	public static void main(String[] args) {
		//take input form user
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter no of elements : ");
		int n= sc.nextInt();
		System.out.println("enter elements : ");
		int arr[] =new int [n];
		for(int i=0;i<n;i++) {					//take ip to array
		arr[i]=sc.nextInt();
			}
		//int arr[] = {4,3,8,2,5};
		for (int i =0; i<n-1 ;i++) {
			for(int j =0; j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
			}
		}
	}
		printArray(arr);
	}
	
}
