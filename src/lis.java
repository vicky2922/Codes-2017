/*Longest Increasing Sequence
 Vicky Bhuva
 04 March 2017
 */
import java.util.Scanner;

public class lis {
	private static Scanner sc;

	public static void main(String [] args){
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0;i<n;i++){
			a[i] = sc.nextInt();
			b[i] = 1;
		}
		for(int i = 1;i<n;i++){
			for(int j = 0 ;j<i ;j++){
				if(a[i]>a[j] && b[i]<b[j]+1){
					b[i]=b[j]+1;
				}
			}
		}
		int max=0;
		for (int i = 0; i < n; i++ )
	        if (max < b[i])
	            max = b[i];
		
		System.out.print("Longest Seq is : " + max);
	}
}
