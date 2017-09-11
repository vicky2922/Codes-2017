import java.util.*;
public class B811codefroces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] a = new int[n];
		int[] b = new int[n+1];
		
		for(int i=0;i<n;++i){
			a[i] = sc.nextInt();
			b[a[i]]=i;
		}
		
		while(m--!=0){
			int l = sc.nextInt();
			int r = sc.nextInt();
			int x = sc.nextInt();
			
			l--;
			r--;
			
			x = a[x-1];
			
			if(b[x]<l || b[x]>r){
				System.out.println("No");
			}
			else{
				int count=0;
				for(int i = l ;i<=r;++i){
					if(a[i]<x){
						count++;
					}
				}
				if(count == b[x]-l){
					System.out.println("Yes");
				}
				else{
					System.out.println("No");
				}
			}
		}
	
				
	}

}
