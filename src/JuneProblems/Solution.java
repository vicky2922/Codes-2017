package JuneProblems;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class Solution {
    
    
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
}
    
    
    
    
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
       
        Scanner in = new Scanner(System.in);
        
               
        int q = in.nextInt();
        
        while(q--!=0){
            int n = in.nextInt();
            int count=0;
            int[] array = new int[n];
            
            for(int i = 0 ; i < n ;i++){
                array[i] = in.nextInt();
            }
            
            for(int i = 0 ; i < n ; i++ ){
               if(isPrime(array[i])){
                   count++;
               }
               
               for(int j = i ; j < n ; j++){
                   if(isPrime(array[i] ^ array[j])){
                       count++;
                   }
               }
                
            }
            System.out.println(count);
        }
        
        
    }
}
