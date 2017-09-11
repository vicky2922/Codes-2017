package julypractice;
/*
 * http://practice.geeksforgeeks.org/problems/sorting-employees/0
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortEmployees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
			int n = sc.nextInt();
			String tempstr;
			int tempn;
			ArrayList<node> a = new ArrayList<node>();
			for(int i = 0 ; i < n ;i++){
				tempstr = sc.next();
				tempn = sc.nextInt();
				a.add(new node(tempstr, tempn));
			}
			
			Collections.sort(a);
			for(node x : a){
				System.out.print(x.name +" "+x.salary+" ");
			}
			System.out.println();
		}

	}
	
	static class node implements Comparable<node>{
		String name;
		int salary;
		
		node(String name, int salary){
			this.name = name;
			this.salary = salary;
		}

		@Override
		public int compareTo(node n) {
			// TODO Auto-generated method stub
			if(this.salary-n.salary < 0){
				return -1;
			}
			else if(this.salary-n.salary > 0){
				return 1;
			}
			return this.name.compareTo(n.name);
		}
		
		
	}

}
