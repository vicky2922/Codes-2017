package julypractice;

import java.util.*;

class Tablet {
    public static void main(String args[] ) throws Exception {
   

        //Scanner
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        
        int[] arr = new int[N];
        int[] finalsum = new int[N];
        
        for(int i = 0 ; i < N ;i++ ){
            arr[i] = s.nextInt();
            
        }
        Arrays.fill(finalsum, 1);
        
        int sum=0;
        for(int i = 1 ; i < N ;i++ ){
            if(arr[i] > arr[i-1]){
                finalsum[i] = finalsum[i] + finalsum[i-1];
            }
        }
        for(int i = N-2 ; i >=0  ;i-- ){ //backtracking 
            if(arr[i]>arr[i+1] && finalsum[i]<=finalsum[i+1]){
                finalsum[i]=finalsum[i+1]+1;
            }   
            
        }
        
        for(int i = 0 ; i < N ;i++ ){
            sum+=finalsum[i];
        }
        
        System.out.println(sum);
        
        
    }
}
