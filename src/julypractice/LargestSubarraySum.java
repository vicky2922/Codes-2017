package julypractice;
//Kadane's algo

import java.util.Scanner;

public class LargestSubarraySum {
	
	int sum(int[] a , int n){
		int current=a[0],finalsum=a[0];
		
		for(int i =0 ; i< n ;i++){
			/*current = current+a[i];
			if(current<0){
				current = 0;
			}
			else if(current > finalsum){
				finalsum = current;
			}*/
			
			current = max(a[i], current+a[i]);
			finalsum = max(finalsum,current);
			
		}
		
		return finalsum;
	}
	
	int max(int a, int b){
		return a>b ? a : b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LargestSubarraySum lss = new LargestSubarraySum();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter length of array : ");
		int n = sc.nextInt();
		int[] a = new int[n];
		
		System.out.println("Enter array : ");
		for(int i =0 ; i< n; i++){
			a[i] = sc.nextInt();
		}
		
		System.out.println("Max contiguous sum is : " + lss.sum(a,n));
	}

}
