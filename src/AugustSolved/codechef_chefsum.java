package AugustSolved;

import java.util.Scanner;

/*
 * https://www.codechef.com/SEPT17/problems/CHEFSUM
 * Accpeted
 */
public class codechef_chefsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
			int n = sc.nextInt();
			int[] arr = new int[n];
			//int sum = 0; 
			
			for(int i = 0; i < n ;i++){
				arr[i] = sc.nextInt();
				//sum += arr[i];
			}
			int min=arr[0],minIndex = 0;
			
			for(int i = 1; i < n ;i++){
				if(min>arr[i]){
					min = arr[i];
					minIndex = i;
				}
			}
			
			System.out.println(minIndex+1);
			
		}
	}

}
