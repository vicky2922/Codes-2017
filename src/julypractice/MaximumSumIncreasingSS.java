package julypractice;

import java.util.Arrays;
import java.util.Scanner;
//LIS modified.. (Amazon, MS)
public class MaximumSumIncreasingSS {

	public static int findsum(int[] a , int n){
		int[] dp = new int[n];
		/*for(int i = 0 ; i<n ; i++){
			dp[i] = a[i];
		}*/
		dp = a;
		int max = dp[0];
		for(int i = 1 ; i < n ; i++){
			for(int j = 0 ; j  < i ; j++){
				if(a[i] > a[j] && dp[i] < dp[j] + a[i]){
					dp[i] = dp[j] + a[i];
				}
			}
			if(dp[i] > max){
				max = dp[i];
			}
			//System.out.println(dp[i] + " ");
		}
		
		return max;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i<n ; i++){
			a[i] = sc.nextInt();
		}
		
		System.out.println("Max sum is : "+findsum(a,n));
	}

}
