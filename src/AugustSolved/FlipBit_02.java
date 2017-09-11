package AugustSolved;

import java.util.Scanner;

/*
 * 1st August 2017
 * http://www.geeksforgeeks.org/oracle-interview-experience-set-47-campus/
 * (1)
 */

public class FlipBit_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = str.length();
		String temp="";
		for(int i = 0 ; i < n ; i++){
			if(i%2==0){
				temp = temp.concat("1");
			}
			else{
				temp = temp.concat("0");
			}
		}
		int count1=0;
		for(int i = 0 ; i < n ; i++){
			if(str.charAt(i)!=temp.charAt(i)){
				count1++;
			}
		}
		temp = "";
		for(int i = 0 ; i < n ; i++){
			if(i%2==1){
				temp = temp.concat("1");
			}
			else{
				temp = temp.concat("0");
			}
		}
		int count2=0;
		for(int i = 0 ; i < n ; i++){
			if(str.charAt(i)!=temp.charAt(i)){
				count2++;
			}
		}
		if(count2<count1){
			System.out.println(count2);
		}
		else{
			System.out.println(count1);
		}
		
	}

}
