import java.util.*;

public class B733codeforces {
	
	public static int abs(int a){
		if(a<0){
			return -a;
		}
		return a;
	}
	
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] l = new int[n];
		int[] r = new int[n];
		
		int suml=0,sumr=0;
		
		for(int i = 0; i<n ; i++){
			l[i] = sc.nextInt();
			suml+=l[i];
			
			r[i] = sc.nextInt();
			sumr+=r[i];
			
		}
		
		int max = abs(suml-sumr);
		int temp=0,column=0;
		for(int i = 0; i<n ; i++){
			temp = l[i];
			l[i] = r[i];
			r[i]  = temp;
			
			suml = suml + l[i] - r[i];
			sumr = sumr + r[i] - l[i];
			
			if(max < abs(suml-sumr)){
				max = abs(suml-sumr);
				column = i+1;
			}
			
			temp = l[i];
			l[i] = r[i];
			r[i]  = temp;
			
			suml = suml + l[i] - r[i];
			sumr = sumr + r[i] - l[i];
			
			
		}
		
		System.out.print(column);
	}
}
