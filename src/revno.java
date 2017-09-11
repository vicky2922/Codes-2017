/*
Reverse Given No
Vicky Bhuva
04 March 2017
 */
import java.util.Scanner;
public class revno {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		//String st = String.valueOf(x);
		//SString st = Long.toString(x);
		char[] ch = ("" + x).toCharArray();
		//char[] ch  = st.toCharArray();
		int n = ch.length;
		for(int i = n-1 ; i>=0;i--){
			System.out.print(ch[i]);
		}
				
	}
}
