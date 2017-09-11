package AugustSolved;
/*
 * http://codeforces.com/problemset/problem/844/A
 * Accepted
 */
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Scanner;

public class codeforces_844A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String string1 = sc.nextLine();
		int length = string1.length();
		int n = sc.nextInt();
		int i = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int count= 0;
		//System.out.println(string1.charAt(38));
		if(n>length){
			System.out.println("impossible");
			
		}else{
			while(i<length){
				
				if(!map.containsKey(string1.charAt(i))){
					map.put(string1.charAt(i), 1);
					count++;
					//System.out.println(string1.charAt(i));
				}
				i++;
			}
			
			if(count < n){
				count = n - count;
			}
			else{
				count = 0;
			}
			
			System.out.println(count);
		}
		
		
		
		
		

	}

}
