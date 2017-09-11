package julypractice;

import java.util.Scanner;

public class codeforces831A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int stat = -1;
		int last = -1;
		for(int i = 1;i <= n;i++){
			int x = sc.nextInt();
			if(x > last  &&  stat != 0){
				if(stat == 1  ||  stat == 2){
					System.out.println("NO");
					return;
				}
				stat = 0;
			}else if(x == last  &&  stat != 1){
				if(stat == 2){
					System.out.println("NO");
					return;
				}
				stat = 1;
			}else if(x < last  &&  stat != 2)
				stat = 2;
			last = x;
		}
		System.out.println("YES");
	}

}
