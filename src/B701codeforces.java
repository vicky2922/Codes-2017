import java.util.*;
public class B701codeforces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		long s1=n,s2=n;
		
		long[] a1 = new long[n+1];
		long[] a2 = new long[n+1];
		
		while(m--!=0){
			int t1 = sc.nextInt();
			int t2 = sc.nextInt();
			
			if(a1[t1]!=t1){
				a1[t1]=t1;
				s1--;
			}
			if(a2[t2]!=t2){
				a2[t2]=t2;
				s2--;
			}
			long ans = s1*s2;
			System.out.println(ans+" ");
		}

	}

}
