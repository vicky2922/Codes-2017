import java.util.*;
public class A812codeforces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int flag = 0;
		for(int i = 0 ; i< 4;i++){
			int l,s,r,p;
			l = sc.nextInt();
			s = sc.nextInt();
			r = sc.nextInt();
			p = sc.nextInt();
			
			if(p==1){
				if(l==0 && s==0 && r==0){
					flag=0;
				}
				else{
					flag=1;
					break;
				}
			}else{
				flag=0;
			}
			
		}
		if(flag==1){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}
