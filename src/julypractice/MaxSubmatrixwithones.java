package julypractice;

import java.util.Scanner;

public class MaxSubmatrixwithones {
	
	int min(int a, int b){
		return a<b ? a : b;
	}
	
	int findmatrix(int[][] a, int n ,int m){
		int max=0;
		int[][] s = new int[n][m];
		
		for(int i =0; i< n ;i++){
			s[i][0] = a[i][0];
		}
		for(int i =0 ; i<m ;i++){
			s[0][i] = a[0][i];
		}
		
		for(int i = 1; i< n ; i++){
			for(int j = 1; j<m ;j++){
				
				if(a[i][j] == 1){
					s[i][j] = min(s[i-1][j], min(s[i][j-1], s[i-1][j-1])) + 1;
					if(max<s[i][j]){
						max = s[i][j];
					}
				}
				else{
					s[i][j] = 0;
				}
			}
		}
		System.out.println("Maximum size sub-matrix is");
		for(int i = 0; i< n ; i++){
			for(int j = 0; j<m ;j++){
				System.out.print(s[i][j]+ " ");
			}
			System.out.println();
		}
		
		
		
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxSubmatrixwithones ms = new MaxSubmatrixwithones();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows : ");
		int n = sc.nextInt();
		System.out.println("Enter no of cols : ");
		int m = sc.nextInt();
		int[][] a = new int[n][m];
		
		for(int i = 0 ;i< n ; i++){
			for(int j = 0; j< m ;j++){
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Max submatrix with ones is " + ms.findmatrix(a,n,m));
		

	}

}
