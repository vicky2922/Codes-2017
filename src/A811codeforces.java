import java.util.*;
public class A811codeforces {
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int minus=1,flag=1;
		
		while((flag==1 && a>=minus) || (flag==0 && b>=minus)){
			if(flag==1){
				a-=minus;
				minus++;
				flag=0;
			}
			else{
				b-=minus;
				minus++;
				flag=1;
			}
		}
		if(flag==1){
			System.out.println("Vladik");
		}
		else{
			System.out.println("Valera");
		}
		
		
	}
}
