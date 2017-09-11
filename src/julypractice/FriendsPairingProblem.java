package julypractice;

import java.util.Scanner;

public class FriendsPairingProblem {

	public static int pairs(int n){
		int[] dp = new int[n+1];
		for(int i = 0 ; i <= n ; i++){
			if(i<=2){
				dp[i] = i;
			}
			else{
				dp[i] = dp[i-1] + (i-1)*dp[i-2];
			}
		}
		return dp[n];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("NO of pairs be : " + pairs(n));
	}

}
