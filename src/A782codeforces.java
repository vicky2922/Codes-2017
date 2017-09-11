import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class A782codeforces {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[2*n];
        int[] b = new int[n+1];
        for(int i = 1;i<n+1;i++){
        	b[i] = 0;
        }
        int max =0, count1=0;
        for(int i = 0;i<2*n;i++){
        	a[i] = in.nextInt();
        	b[a[i]]++;
        	if(b[a[i]] == 1){
        		count1++;
        	}
        	if(b[a[i]] == 2){
        		count1--;
        	}
        	if(max < count1){
        		max = count1;
        	}
        	
        }
        System.out.print(max);
        
    }
}