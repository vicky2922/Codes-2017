import java.util.*;
public class A799codeforces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int k = sc.nextInt();
		int d = sc.nextInt();
		
		if(k>=n){
			System.out.println("NO");
		}
		else{
			if(Math.ceil((float)n/k)*t - t > d){
				
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}

}
