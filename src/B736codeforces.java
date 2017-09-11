import java.util.*;
import java.lang.*;
/*HELP : https://en.wikipedia.org/wiki/Goldbach%27s_conjecture*/
public class B736codeforces {
	
	
	
	public static boolean isprime(int number){
		int m;
		m=(int) (Math.sqrt(number));    
		  for(int i=2;i<=m;i++){    
			  if(number%i==0){    
				  return false;    
			  }    
		  }    
		  return true;    
		}  
	
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sum=0;
		
		if(isprime(n))
	    {
			System.out.print("1");
	    }
	    else
	    {
	        if(n%2 != 0)
	        {
	            n-=2;
	            if(isprime(n))
	            {
	            	System.out.print(2);
	            }
	            else
	            {
	            	System.out.print(3);
	            }
	            
	        }
	        else
	        {
	        	System.out.print(2);
	        }
	    }
		
		
	}
}
