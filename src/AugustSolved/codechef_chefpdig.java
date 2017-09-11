package AugustSolved;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/*
 * https://www.codechef.com/SEPT17/problems/CHEFPDIG
 * Accepted
 */
public class codechef_chefpdig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int t = sc.nextInt();
		sc.nextLine();	//consume new line
		while(t--!=0){
			StringBuffer string = new StringBuffer();
			string.append(sc.nextLine());
			
			int[] count = new int[10];
			Arrays.fill(count,0);
			
			for(int i = 0 ; i < string.length() ;i++){
				count[Integer.parseInt(string.substring(i,i+1))]++;
			}
			StringBuffer finalstring = new StringBuffer();
			char z = 0;
			for(int i = 0 ; i < 10  ; i++){
				for(int j = 0 ; j < 10 ; j++){
					z = 0;
						if(i==j && count[i]>=2){
							z = (char) (i*10 + j);
						}
						else if(i!=j && count[i]>=1 && count[j]>=1){
							z = (char) (i*10 + j);
						}
						if(z >= 'A' && z <= 'Z'){
							finalstring.append(z);
						}
					
				}
			}
			
			pw.println(finalstring);
			
		}
		
		
		pw.close();
	}
	
}
