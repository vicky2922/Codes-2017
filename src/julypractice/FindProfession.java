package julypractice;

import java.util.Scanner;
/*
 * http://practice.geeksforgeeks.org/problems/finding-profession/0
*/
public class FindProfession {
	
	static char fP(int level, int position){
		if(level == 1){
			return 'e';
		}
		if (fP(level-1, (position+1)/2) == 'd')		//d's child d and e
	        return (position%2)==1 ? 'd' : 'e';
	 
	    return (position%2)==1?  'e' : 'd';
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
		int level = sc.nextInt();
		int position = sc.nextInt();
		
		System.out.println(fP(level, position) == 'e' ? "Engineer" : "Doctor");

		}

	}

}
