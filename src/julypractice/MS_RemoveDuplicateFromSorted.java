package julypractice;

import java.util.Scanner;

public class MS_RemoveDuplicateFromSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int  t = sc.nextInt();
		while(t--!=0){
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ; i < n ; i++){
				a[i] = sc.nextInt();
			}
			int temp=0;
			for(int i = 0 ; i < n ; i++){
				if(i == 0){
					temp = a[0];
					System.out.print(a[0]+" ");
				}
				else{
					if(a[i] != temp){
						temp = a[i];
						System.out.print(a[i]+" ");
					}
				}
			}
			
		}
		
	}

}

/*
 * 
 * if unsorted array was given then store it on Hashmap with its occurrence
 * and traverse in array and check in map if its not zero print it and make its occurrence zero
 * 
 */
