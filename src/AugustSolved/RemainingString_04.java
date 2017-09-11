/**
 * 1st August 2017
 * http://practice.geeksforgeeks.org/problems/remaining-string/0
 */
package AugustSolved;

import java.util.Scanner;

/**
 * @author Vicky
 *	Not Completed
 */
public class RemainingString_04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
			String str = sc.next();
			char ch = sc.next().charAt(0);
			int n = sc.nextInt();
			int i;
			for(i = 0 ; i < str.length() && n > 0;i++){
				if(str.charAt(i) == ch){
					n--;
				}
			}
			System.out.println(str.substring(i));
		}

	}

}
