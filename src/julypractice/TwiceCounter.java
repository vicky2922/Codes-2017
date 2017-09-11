package julypractice;

import java.util.HashMap;
import java.util.Scanner;

public class TwiceCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0;i<n;i++){
			if(!map.containsKey(a[i])){
				map.put(a[i], 0);
			}
			map.put(a[i], map.get(a[i]) + 1);
		}
		
		int count=0;
		
		//Traverse Hashmap...
		for (Integer key : map.keySet()) {
			Integer value = map.get(key);
			if(value == 2){
				count++;
			}
			//System.out.println(key+" "+value);
		}
		System.out.println(count);

	}

}
