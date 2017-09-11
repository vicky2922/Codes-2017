/**
 * 1st August 2017
 * http://practice.geeksforgeeks.org/problems/maximum-number-of-zeroes/0
 */
package AugustSolved;

import java.util.Scanner;

/**
 * @author Vicky
 *	Not Completed
 */
public class MaximumNumberofZeroes_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
			int n = sc.nextInt();
			int[] a = new int[n];
			int[] temp = new int[n];
			for(int i = 0 ; i <  n ; i++){
				a[i] = sc.nextInt();
				temp[i] = a[i];
			}
			
			int c,pos=0;
			int max=0;
			for(int i = 0 ; i < n ; i++){
				c=0;
				while(a[i]>0){
					if(a[i]%10 == 0){
						c++;
						
					}
					a[i]/=10;
					
				}
				if(max < c){
					max = c;
					pos = i;
				}
				
			}
			
			
			if(max == 0){
				System.out.println("-1");
				return;
			}
			System.out.println(temp[pos]);
		}
		
		
	}

}
