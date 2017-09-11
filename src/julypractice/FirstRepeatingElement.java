package julypractice;
/*
 * http://practice.geeksforgeeks.org/problems/first-repeating-element/0 
*/
import java.util.*;
 
class FirstRepeatingElement{
	
    static void printFirstRepeating(int arr[]){
        int min = -1;
 
        HashSet<Integer> set = new HashSet<>();
 
        for (int i=arr.length-1; i>=0; i--){
            if (set.contains(arr[i]))
                min = i;
            else  
                set.add(arr[i]);
        }
 
        if (min != -1)
          System.out.println(min+1);
        else
          System.out.println("-1");
    }
 
    public static void main (String[] args) throws java.lang.Exception{
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	while(t--!=0){
    		int n = sc.nextInt();
    		int[] arr = new int[n];
    		for(int i = 0 ; i < n ;i++){
    			arr[i] = sc.nextInt();
    		}
    		printFirstRepeating(arr);
    	}
        
        
    }
}
  
