package JuneProblems;
import java.math.BigInteger;
import java.util.*;
public class WackyWorkouts {
	
	static int fib(int n)
    {
        /* Declare an array to store Fibonacci numbers. */
    int f[] = new int[n+1];
    int i;
      
    /* 0th and 1st number of the series are 0 and 1*/
    f[0] = 1;
    f[1] = 2;
     
    for (i = 2; i <= n; i++)
    {
       /* Add the previous 2 numbers in the series
         and store it */
        f[i] = f[i-1] + f[i-2];
    }
      
    return f[n];
    }
	
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
			int n = sc.nextInt();
			
			System.out.println(fib(n));
		}
	}
}
