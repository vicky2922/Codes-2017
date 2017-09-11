package AugustSolved;
/*
 * http://codeforces.com/problemset/problem/846/A
 * Accpted
 */
import java.util.Scanner;

public class codeforces_846A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0 ; i  < n ; i++){
			arr[i] = sc.nextInt();
		}
		
		int answer=  0;
		
		for(int i=0; i<n; i++){

		    int cnt = 0;
		    for(int j=0; j<=i; j++)
		        if(arr[j] == 0) cnt++;
		    
		    for(int j=i; j<n; j++)
		        if(arr[j] == 1) cnt++;
		    
		    answer = Math.max(answer, cnt);
		}
		System.out.println(answer);

	}

}


