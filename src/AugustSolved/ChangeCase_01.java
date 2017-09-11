package AugustSolved;

import java.util.Scanner;

/*
 * 1st August 2017
 * http://www.geeksforgeeks.org/oracle-interview-experience-set-47-campus/
 * (2)
 */

public class ChangeCase_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		if(str.charAt(0)>= 'A' && str.charAt(0)<='Z'){
			str = str.toUpperCase();
		}
		else{
			str = str.toLowerCase();
		}
		System.out.println(str);

	}

}
