package julypractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import julypractice.TowerOfHanoi.Node;
//Not Completed
public class BiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String temp;

		ArrayList<Node> a = new ArrayList<Node>();
		for(int i = 0 ; i < n ; i++){
			temp = sc.next();
			a.add(new Node(temp));
		}
		/*a.add(new Node("54"));
		a.add(new Node("546"));
		a.add(new Node("548"));
		a.add(new Node("60"));*/
		
		Collections.sort(a);
		
		
		for (Node x : a)
	        System.out.print(x.str);
		
	}
	
	static class Node implements Comparable<Node>
	{
		String str;
		Node(String s)
		{
			str = s;
		}
		public int compareTo(Node node)
		{
			String XY = this.str.concat(node.str);
			
			
			
			String YX = node.str.concat(this.str);
			
			/*System.out.println(Integer.parseInt(XY) > Integer.parseInt(YX));
			
			return Integer.parseInt(XY)-Integer.parseInt(YX) > 0   ? 1 : 0;*/
			
			return YX.compareTo(XY);
		    
		}
	}

}
