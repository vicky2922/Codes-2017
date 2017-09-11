package julypractice;

import java.util.Scanner;

public class LongestCommonSubsequence {
	
	/*
	 * Recursive having complexity of O(2^n)
	 * 
	 * int lcs(char[] b1,char[] b2, int n, int m){
		
		if(m == 0 || n==0){
			return 0;
		}
		if(b1[n-1] == b2[m-1]){
			return 1 + lcs(b1,b2,n-1,m-1);
		}
		else{
			return max(lcs(b1,b2,n-1,m),lcs(b1,b2,n,m-1));
		}
		
	}*/
	
	/*
	 * Using Dynamic Programming approch having complexity of O(mn)
	 * */
	int lcs(char[] b1, char[] b2, int n, int m){
		int[][] l = new int[n+1][m+1];
		
		for(int i = 0 ; i < n+1 ; i++){
			for(int j = 0 ; j< m+1 ; j++){
				if(i==0 || j==0){
					l[i][j] = 0;
				}
				else if(b1[i-1] == b2[j-1]){
					l[i][j] = 1+ l[i-1][j-1];
				}
				else{
					l[i][j] = max(l[i-1][j],l[i][j-1]);
				}
			}
		}
		return l[n][m];
	}
	
	
	
	int max(int a,int b){
		return a > b ?  a : b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LongestCommonSubsequence l = new LongestCommonSubsequence();
		
		Scanner sc = new Scanner(System.in);
		
		String a1 = sc.nextLine();
		String a2 = sc.nextLine();
		
		char[] b1 = a1.toCharArray();
		char[] b2 = a2.toCharArray();
		
		int n = b1.length;
		int m = b2.length;
		
		System.out.println("Longest subsequence is : " + l.lcs(b1,b2,n,m));
		
		
	}

}
