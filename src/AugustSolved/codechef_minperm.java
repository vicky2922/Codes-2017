package AugustSolved;
/*
 * https://www.codechef.com/SEPT17/problems/MINPERM
 * Accepted
 */
import java.util.Scanner;

public class codechef_minperm {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0 ; i < n ; i++) arr[i] = i+1;
			if(n%2==0){
				
				for(int i = 0 ; i < n-1; i+=2){
					int temp;
					temp = arr[i];
					arr[i]= arr[i+1];
					arr[i+1] = temp;
				}
				
				for(int i = 0 ; i < n; i++){
					System.out.print(arr[i]+" ");
				}
				
			}
			else{
				
				for(int i = 0 ; i < n-3; i+=2){
					int temp;
					temp = arr[i];
					arr[i]= arr[i+1];
					arr[i+1] = temp;
				}
				
				int temp;
				temp = arr[n-3];
				arr[n-3] = arr[n-2];
				arr[n-2] = arr[n-1];
				arr[n-1] = temp;
				
				
				for(int i = 0 ; i < n; i++){
					System.out.print(arr[i]+" ");
				}
			}
			System.out.println();
		}
		

	}

}
