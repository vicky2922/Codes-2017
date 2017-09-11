package julypractice;

import java.util.HashMap;
import java.util.Scanner;

public class count_pair_given_sum {
	
	static int countpairs(int[] a, int sum){
		HashMap<Integer, Integer> hm = new HashMap<>();
		int n = a.length;
		for (int i=0; i<n; i++){
            // initializing value to 0, if key not found
            if(!hm.containsKey(a[i]))
                hm.put(a[i],0);
                 
            hm.put(a[i], hm.get(a[i])+1);
        }
		
		int twice_count = 0;
		   
        // iterate through each element and increment the
        // count (Notice that every pair is counted twice)
        for (int i=0; i<n; i++)
        {
            twice_count += hm.get(sum-a[i]);
   
            if (sum-a[i] == a[i])
                twice_count--;
        }
   
        // return the half of twice_count
        return twice_count/2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i< n ; i++){
			a[i] = sc.nextInt();
		}
		int sum = sc.nextInt();
		
		System.out.println("-> " + countpairs(a,sum));
		
	}

}
