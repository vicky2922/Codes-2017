package julypractice;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * http://practice.geeksforgeeks.org/problems/stock-buy-and-sell/0
 * 
 * use of local maxima and minima
 */
public class StockProfit {
	
	static class interval{
		int buy;
		int sell;
	}
	
	static void findprofitdays(int[] a){
		int n = a.length;
		
		if(n==0){
			return;
		}
		int count=0;
		
		ArrayList<interval> answer = new ArrayList<interval>();
		
		for(int i = 0 ; i < n-1;){
			
			while ((i < n - 1) && (a[i + 1] <= a[i]))
                i++;
			
			if(i == n-1){
				break;
			}
			
			interval temp = new interval();
			temp.buy = i++;
			
			while ((i < n) && (a[i] >= a[i-1]))
                i++;
			
			temp.sell = i-1;
			
			answer.add(temp);
			
			count++;
		}
		if(count==0){
			System.out.print("No Profit");
		}
		else{
			for(interval x : answer){
				System.out.print("("+x.buy+" "+x.sell+")"+" ");
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t  = sc.nextInt();
		while(t--!=0){
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ; i < n ;i++){
				a[i] = sc.nextInt();
			}
			
			findprofitdays(a);
			System.out.println();
		}
	}

}
