package julypractice;
/*
 * http://practice.geeksforgeeks.org/problems/armstrong-numbers/0
*/
import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n--!=0){
			int x = sc.nextInt();
			int result=0,m=x;
			while(x!=0){
				result += (int) Math.pow(x%10, 3);
				x = x/10;
			}
			if(result == m){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
		}

	}

}
