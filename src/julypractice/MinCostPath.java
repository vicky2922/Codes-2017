package julypractice;

import java.util.Scanner;

public class MinCostPath {
	
	int min(int x, int y, int z){
		if (x < y)
            return (x < z)? x : z;
        else
            return (y < z)? y : z;
	}
	
	
	int mis(int[][] a, int m, int n, int p, int q){
		
		int[][] d = new int[m+1][n+1];
		
		d[0][0] = a[0][0];
		
		for(int i = 1 ; i <= p ;i++){
			d[i][0] = d[i-1][0] + a[i][0];
		}
		
		for(int i = 1 ; i <= q ;i++){
			d[0][i] = d[0][i-1] + a[0][i];
		}
		
		for(int i = 1 ; i< p+1 ;i++){
			for(int j = 1 ; j< q+1 ; j++){
				d[i][j] = min(d[i-1][j-1],d[i-1][j],d[i][j-1]) + a[i][j];
			}
		}
		
		return d[p][q];
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MinCostPath x = new MinCostPath();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows and cols : ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		System.out.println("Enter matrix : ");
		
		int[][] a = new int[m][n];
		
		for(int i =0 ; i < m ; i++){
			for(int j =0;j<n ;j++){
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter destination address : ");
		int p = sc.nextInt();
		int q = sc.nextInt();
		
		System.out.println("Min Cost for given address is : " + x.mis(a,m,n,p,q));

	}

}
