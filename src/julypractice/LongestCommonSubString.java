package julypractice;

import java.util.Scanner;

public class LongestCommonSubString {
	
	int max(int x, int y){
		return x>y?x:y;
	}
	
	int length(String s1, String s2){
		int n = s1.length();
		int m = s2.length();
		int[][] a = new int[n+1][m+1];
		int result =0;
		
		for(int i = 0 ; i<= n ; i++){
			for(int j = 0 ; j < m ; j++){
				if(i == 0  || j ==0){
					a[i][j] = 0;
				}
				else if(s1.charAt(i-1) == s2.charAt(j-1)){
					a[i][j] = a[i-1][j-1] + 1;
					result = max(result,a[i][j]);
				}
				else{
					a[i][j] = 0;
				}
			}
		}
		
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestCommonSubString x = new LongestCommonSubString();
		
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		System.out.println(x.length(s1,s2));
		
	}

}

/* 	geeksforgeeks
	geekslove
	5
 */
