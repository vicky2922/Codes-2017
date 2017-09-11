package julypractice;

import java.util.Scanner;

public class MinJump {
	
	public static int minjump(int[] a){
		/*int[] dp = new int[a.length];
		dp[0] = 0;
		
		for(int i = 1 ; i < a.length; i++){
			dp[i] = Integer.MAX_VALUE;
			
			for(int j = 0 ; j  <i; j++){
				if(j + a[j] >= i && dp[j] != Integer.MAX_VALUE){
					dp[i] = Math.min(dp[i], dp[j] + 1);
					break;
				}
			}
		}
		return dp[a.length - 1];*/
		
		if (a.length <= 1)
            return 0;
 
        // Return -1 if not possible to jump
        if (a[0] == 0)
            return -1;
 
        // initialization
        int maxReach = a[0];
        int step = a[0];
        int jump = 1;
        
        for(int i = 1 ; i<a.length;i++){
        	if(i == a.length-1){
        		return jump;
        	}
        	
        	maxReach = Math.max(maxReach, i+a[i]);
        	
        	step--;
        	
        	if(step == 0){
        		jump++;
        		
        		if(i >= maxReach){
        			//Max Reach updated but comes at that own position thats why terminate
        			return -1;
        		}
        		
        		step = maxReach - i;
        	}
        	
        }
        return -1;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ; i < n ; i++){
				a[i] = sc.nextInt();
			}
			System.out.println(minjump(a));
		}
		

	}

}
