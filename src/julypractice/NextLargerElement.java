package julypractice;
/*
 * http://practice.geeksforgeeks.org/problems/next-larger-element/0
*/
import java.util.Scanner;

public class NextLargerElement {
	
	public static void NextNumber(int[] a, int n){
		int[] dp = new int[n];
		for(int i = 0 ; i < n ; i++){
			for(int j = n-1; j > i ; j-- ){
				if(a[j] > a[i]){
					dp[i] = a[j];
				}
			}
		}
		for(int i = 0 ; i < n ; i++){
			if(dp[i] == 0){
				dp[i] = -1;
			}
			System.out.print(dp[i]+ " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ; i < n ; i++){
				a[i] = sc.nextInt();
			}
			NextNumber(a,n);
			System.out.println();
		}

	}

}
