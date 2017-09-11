package julypractice;

import java.util.Scanner;

public class CountWayforNX4 {
	public static int ways(int n){
		int[] dp = new int[n+1];
		dp[0] = 0 ;
		 for(int i=1;i<=n;i++)
	        {
	            if (i >= 1 && i <= 3)
	                dp[i] = 1;
	            else if (i==4)
	                dp[i] = 2 ;
	 
	            else{
	                    dp[i] = dp[i-1] + dp[i-4];
	            }
	        }
	        return dp[n];
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("No of way to tile in NX4 is : " + ways(n));
	}
}
