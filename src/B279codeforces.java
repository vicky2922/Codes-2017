import java.util.*;
public class B279codeforces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int t = sc.nextInt();
		int c = 0,sum=0,index=0;
		int[] a = new int[n];
		
		for(int i = 0; i<n ;i++){
			a[i] = sc.nextInt();
			
			sum+=a[i];
			if(sum<=t)
			{
				c++;
			}
			else{
				sum-=a[index];
				index++;
			}

		}
		
		System.out.println(c);
	}

}
