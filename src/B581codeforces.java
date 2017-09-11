import java.util.*;

public class B581codeforces {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n;
		n = s.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = s.nextInt();
		}
		
		int max=0;
		for(int i = a.length-1;i>=0;i--){
			if(a[i]>max){
				max=a[i];
				a[i]=0;
			}
			else{
				a[i] = max-a[i]+1;
			}
		}
		
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
		
		
	
	}
}
