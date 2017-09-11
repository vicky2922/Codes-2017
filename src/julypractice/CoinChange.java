package julypractice;

import java.util.Arrays;
import java.util.Scanner;

public class CoinChange {
	
	long countWays(int[] a , int m, int n){
		long[] table = new long[n+1];
		
		Arrays.fill(table, 0);
		
		table[0] = 1;
		
		for(int i = 0; i< m ;i++ ){
			for(int j = a[i] ; j <= n ; j++){
				table[j] = table[j] + table[j-a[i]];
			}
		}
		
		return table[n];
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoinChange x = new CoinChange();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of coins : ");
		int m = sc.nextInt();
		
		int[] a = new int[m];
		
		System.out.println("Enter coins : ");
		for(int i = 0 ; i < m ; i++){
			a[i] = sc.nextInt();
		}
       // int m = arr.length;
		System.out.println("Enter amount of change : ");
        int n = sc.nextInt();
        System.out.println("No of Ways is : "+x.countWays(a, m, n));

	}

}
