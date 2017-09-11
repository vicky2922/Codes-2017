import java.util.*;
public class A810codeforces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		float k = sc.nextFloat();
		int[] a = new int[n];
		float sum=0;
		for(int i = 0; i< n ; i++){
			a[i] = sc.nextInt();
			sum+=a[i];
		}
		float cavg = (float) sum/n;
		float hn = (float) n/2;
		float x=0;
		if(cavg < (k-0.5)){
			x = 2*(-sum -hn+n*k);
			System.out.println((int)x);
		}
		else{
			System.out.println("0");
		}
		/*
		System.out.println(sum);
		System.out.println(cavg);
		System.out.println(k-0.5);
		System.out.println(x);
		*/
		
		
		
	}

}
