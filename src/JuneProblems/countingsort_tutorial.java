

/*
	 	QuickSort, MergeSort, HeapSort are comparison based sorting algorithms.
	CountSort is not comparison based algorithm. It has the complexity of O(n+k), 
	where k is the maximum element of the input array.
		So, if k is O(n), CountSort becomes linear sorting, which is better than 
	comparison based sorting algorithms that have O(nlogn)time complexity. 
	The idea is to extend the CountSort algorithm to get a better time complexity 
	when k goes O(n^2). Here comes the idea of Radix Sort.
	
 */

package JuneProblems;

import java.util.*;
public class countingsort_tutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub




      //Scanner
      Scanner s = new Scanner(System.in);
      int N = s.nextInt();
      int[] a = new int[N];
     // int[] output = new int[N];

      for(int i = 0 ; i < N ; i++){
          a[i] = s.nextInt();
      }
      
      int[] count = new int[101];
     // int[] count2 = new int[101];
      
      for (int i=0; i<101; i++)
          count[i] = 0;
      
      for (int i=0; i<N; i++){
          count[a[i]]++;
        //  count2[a[i]] = count[a[i]];
      }
    /*  
       for (int i=1; i<101; i++){
          count[i] += count[i-1];
       } 
      */    
     /*
      for (int i = 0; i<N; i++)
      {
          output[count[a[i]]-1] = a[i];
          count[a[i]]--;
      }
      */
      for(int i = 1 ; i<101 ; i++){
         // System.out.println(output[i]+" "+count2[output[i]]);
         if(count[i] == 0){
             continue;
         }
         else{
            System.out.println(i+" "+count[i]); 
         }
         
      }

     // System.out.println("Hello World!");
  }
}
