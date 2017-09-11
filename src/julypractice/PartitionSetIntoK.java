package julypractice;

import java.util.Scanner;

public class PartitionSetIntoK {
	
	int count(int n , int k){
		int[][] f = new int[n+1][k+1];
		for(int i = 0 ; i<= n ; i++ ){
			f[i][0] = 0;
		}
		for(int i = 0; i<=k ;i++){
			f[0][i] = 0;
		}
		
		for(int i = 1 ; i <= n;i++){
			for(int j = 1 ; j <= k  ; j++){
				if(j == 1 || i == j){
					f[i][j] = 1;
				}
				else{
					f[i][j] = j*f[i-1][j] + f[i-1][j-1];
				}
			}
		}
		
		
		return f[n][k];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PartitionSetIntoK x = new PartitionSetIntoK();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		System.out.println("No of partition is " +x.count(n,k));

	}

}

/*
 * for 5,2
 * 
 * ans is 15
 * 
 * (j==1)th col and (i==j) diagonal represent,
 * partition in 1 or n==k respectively
 * 
 * 
 *
*/