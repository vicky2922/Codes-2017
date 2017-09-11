/* https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/count-numbers-46/ */
package AprilSolved;
import java.util.Scanner;

public class CountNumber {
	 public static void main(String args[] ) {
	       
	        Scanner s = new Scanner(System.in);
	        int t = s.nextInt();
	        while(t--!=0){
	            int n = s.nextInt();
	            String str = s.next();
	            int count=0;
	           // char[] c = str.toCharArray();
	            for(int i = 0 ; i<n ; i++){
	            	char ch = str.charAt(i);
	                if(ch >= '0' && ch <= '9'){
	                	while(ch >= '0' && ch <= '9'){
	                		i++;
	                		ch = str.charAt(i);
	                	}
	                	count++;
	                }
	                //System.out.println(count);
	            }
	            System.out.println(count);
	        }
	    }
}
