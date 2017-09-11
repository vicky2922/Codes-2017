package julypractice;

import java.util.Scanner;

public class NumberOfWayToScore {
	
	int countways(int n){
		int[] dp = new int[n+1];
		
		dp[0] = 1;
		
		for(int i = 3; i < n+1 ;i++){
			dp[i] += dp[i-3];
		}
		for(int i = 5; i < n+1 ;i++){
			dp[i] += dp[i-5];
		}
		for(int i = 10; i < n+1 ;i++){
			dp[i] += dp[i-10];
		}
		return dp[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberOfWayToScore x = new NumberOfWayToScore();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("No of Ways to Score "+n+" is -> "+x.countways(n));
	}

}
