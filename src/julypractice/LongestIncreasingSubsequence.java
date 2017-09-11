package julypractice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LongestIncreasingSubsequence {
	
	
	int lis(int[] a, int n){
		
		int[] temp = new int[n];
		int max=0;
		
		Arrays.fill(temp, 1);
		
		for(int i = 1; i< n ;i++){
			for(int j = 0 ; j < i ;j++){
				if(a[i] > a[j] && temp[i] < temp[j] +1){
					temp[i] = temp[j] +1;
				}
			}
		}
		for(int i = 0 ; i < n ; i++){
			if(max<temp[i]){
				max = temp[i];
			}
		}
		
		
		
		return max;
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LongestIncreasingSubsequence x = new LongestIncreasingSubsequence();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements : ");
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++){
			a[i] = sc.nextInt();
		}
		
		System.out.println("Longest incresing subsequence is "+ x.lis(a,n));
		
		

	}

}
