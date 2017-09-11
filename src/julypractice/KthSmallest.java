package julypractice;
/*
 * http://practice.geeksforgeeks.org/problems/kth-smallest-element/0
*/
import java.util.Arrays;
import java.util.Scanner;

public class KthSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
			int n = sc.nextInt();
			int[] a = new int[1001];
			Arrays.fill(a, -1);
			int temp;
			for(int i = 0 ; i<n ;i++){
				temp = sc.nextInt();
				a[temp] = i;
			}
			
			int k = sc.nextInt();
			int count = 0,g;
			for(g = 0 ; g<1001 && count < k ;g++){
				if(a[g] > -1){
					count++;
				}
				//System.out.println(g + " "+a[g]);
			}
			System.out.println(g-1);
		}

	}

}
