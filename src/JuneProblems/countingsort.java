

package JuneProblems;
import java.util.*;
public class countingsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub




      //Scanner
      Scanner s = new Scanner(System.in);
      int N = s.nextInt();
      int[] a = new int[N];
      int[] output = new int[N];

      for(int i = 0 ; i < N ; i++){
          a[i] = s.nextInt();
      }
      
      int[] count = new int[101];
     // int[] count2 = new int[101];
      
      for (int i=0; i<101; i++)
          count[i] = 0;
      
      for (int i=0; i<N; i++){
          count[a[i]]++;
      //    count2[a[i]] = count[a[i]];
      }
      
       for (int i=1; i<101; i++){
          count[i] += count[i-1];
       } 
          
      for (int i = 0; i<N; i++)
      {
          output[count[a[i]]-1] = a[i];
          count[a[i]]--;
      }
      
      for(int i = 0 ; i<N ; i++){
          System.out.println(output[i]+" "/*+count2[output[i]]*/);
      }

     // System.out.println("Hello World!");
  }
}
