package julypractice;

import java.util.Arrays;
import java.util.Scanner;

public class MaxLengthOfChainPair {

	int a;
	int b;
	
	public MaxLengthOfChainPair(int a,int b){
		this.a = a;
		this.b = b;
	}
	
	public static int findLength(MaxLengthOfChainPair a[], int n){
		int[] dp = new int[n];
		
		Arrays.fill(dp, 1);
		
		for(int i = 1 ; i < n; i++){
			for(int j = 0 ; j < i ;j++){
				if(a[i].a > a[j].b && dp[i] < dp[j] + 1){
					dp[i] = dp[j]  +1;
				}
			}
		}
		int max = 0;
		for(int i = 0 ; i < n ; i++){
			if(max<dp[i]) {
				max = dp[i] ;
			}
		}
		
		return max;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		MaxLengthOfChainPair[] a = new MaxLengthOfChainPair[n]; //Array of object
		int y,z;
		for(int i = 0 ; i < n ; i++){
			y = sc.nextInt();
			z = sc.nextInt();
			a[i] = new MaxLengthOfChainPair(y, z);
		}
		
		System.out.println("Length is : "+findLength(a,n));
	}
}

/*
5
5 24
15 25
27 40
50 60
61 70
Length is : 4
*/
