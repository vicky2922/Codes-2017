import java.util.*;
public class B545codeforces {
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String b = sc.nextLine();
		
		int count=0,hamming=0;
		
		int[] ac = new int[a.length()];
		
		for(int i = 0 ;i<a.length();i++){
			if(a.charAt(i) != b.charAt(i)){
				hamming++;
				ac[i] = 1;
			}
		}
		
		if(hamming%2 == 0){
			
			for(int i = 0 ;i< a.length();i++){
				if(count < hamming/2){
					System.out.print(a.charAt(i));
					if(ac[i]==1){
					count++;}
				}
				else{
					System.out.print(b.charAt(i));
					if(ac[i]==1){
						count++;}
				}
			}
			
		}
		else{
			System.out.print("impossible");
		}
		
	}
}
