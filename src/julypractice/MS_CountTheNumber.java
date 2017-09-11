package julypractice;

import java.util.Scanner;

public class MS_CountTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t--!=0){
			int count = sc.nextInt();
			
			int total=0;
			int n=count / 100;
			int m=count % 100;
			if(count<600 && count > 10)
			{
				total=total+(n*25)+5;
				if(m<60 && m>10)
				{
	    			int x1=m/5;
	    			if(x1%2==1)
	    			{
	    				total=total+(x1/2)*5;
	    			}
	    			else
	    				total=total+((x1/2-1)*5+(m%10));
				}
				else if(m>60)
					total=total+25;
			}
			else if(count>600)
				total=(25*6)+5;
			
			else if(count<10)
	            if(count/5==1)
	                total=5;
	            else
	                total=count%5;
	        

			System.out.println(total);
			
			
		}
		
		

	}

}
