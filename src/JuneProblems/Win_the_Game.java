package JuneProblems;

import java.util.Scanner;

public class Win_the_Game {
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
			float r = sc.nextFloat();
			float g = sc.nextFloat();
			
			float ans=0.000000F;
			
			ans = r/(r+g);
			//String.format("%.6f", ans);
			System.out.printf("%.6f", ans);
			
		}
	}
}
