package AugustSolved;
/*
 * http://codeforces.com/problemset/problem/845/A
 * Accepted
 */
import java.util.Arrays;
import java.util.Scanner;

public class codeforces_845A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[2*n];
		for(int i = 0 ; i < 2*n ; i++){
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		if(arr[n-1] < arr[n]){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
		

	}

}
