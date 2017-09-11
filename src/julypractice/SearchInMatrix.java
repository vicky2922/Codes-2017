package julypractice;

import java.util.Arrays;
import java.util.Scanner;
/*
 * http://practice.geeksforgeeks.org/problems/search-in-a-matrix/0
 */
public class SearchInMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] arr = new int[n*m];
			for(int i = 0 ; i < n*m ;i++){
				arr[i] = sc.nextInt();
			}
			int x = sc.nextInt();
			
			int flag = Arrays.binarySearch(arr, x);
			
			if(flag<0){
				System.out.println("0");
			}
			else{
				System.out.println("1");
			}
		}

	}

}
