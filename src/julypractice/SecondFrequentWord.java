package julypractice;

import java.util.HashMap;
import java.util.Scanner;

public class SecondFrequentWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] str = new String[n+1];
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		System.out.println();
		for(int i = 0 ; i  < n+1 ; i++){
			str[i] = sc.nextLine();
			
		}
		for(int i = 0 ; i  < n+1 ; i++){
			
			if(!map.containsKey(str[i])){
				map.put(str[i], 0);
			}
			map.put(str[i], map.get(str[i]) + 1);
		}
		
		/*for(String s : map.keySet()){
			Integer value = map.get(s);
			System.out.println(s+" "+value);
		}*/
		
		
		
		
	}

}
