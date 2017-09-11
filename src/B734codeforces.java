import java.util.*;
public class B734codeforces {
	
	public static void main(String args []){
		
		Scanner sc = new Scanner(System.in);
		
		int k2 = sc.nextInt();
		int k3 = sc.nextInt();
		int k5 = sc.nextInt();
		int k6 = sc.nextInt();
		
		int x,sum;
		
		if(k2<k5){
			if(k2<k6){
				x=k2;
				k2=0;
				k6-=x;
				k5-=x;
			}else{
				x=k6;
				k6=0;
				k2-=x;
				k5-=x;
			}
		}
		else{
			if(k5<k6){
				x=k5;
				k5=0;
				k6-=x;
				k2-=x;
			}else{
				x=k6;
				k6=0;
				k5-=x;
				k2-=x;
			}
		}
		
		sum = x*256;
		
		if(k2>k3){
			x = k3;
		}
		else{
			x = k2;
		}
		
		sum = sum + x*32;
		
		System.out.println(sum);
	}

}
