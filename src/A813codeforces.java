import java.util.*;
public class A813codeforces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x;
		//int[] a = new int[n];
		int sum=0;
		for(int i = 0 ; i< n ; i++){
			x = sc.nextInt();
			sum += x;
		}
		
		int m = sc.nextInt();
		int flag=0;
		
		for(int i = 0; i< m ;i++){
			int l = sc.nextInt();
			int y = sc.nextInt();
			
			if(sum<l){
				System.out.println(l);
				flag=1;
				break;
			}
			if(sum>y) {continue;}
			
			System.out.println(sum);
			flag=1;
			break;
			
		}
		
		if(flag == 0) System.out.println("-1");
		
	}

}
