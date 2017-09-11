package julypractice;

public class knapsack {

	int max(int x,int y){
		return x>y ? x: y;
	}
	
	int knapSack(int W, int[] wt, int[] val, int n){
		
		int[][] k = new int[n+1][W+1];
		
		for(int i = 0 ; i < n+1 ; i++){
			for(int w= 0 ; w<=W; w++){
				if(i ==0 || w==0){
					k[i][w]=0;
				}
				else if(wt[i-1] <= w){
					k[i][w] = max(val[i-1] + k[i-1][w-wt[i-1]],k[i-1][w]) ;
				}
				else{
					k[i][w] = k[i-1][w];
				}
			}
		}
		
		
		
		
		return k[n][W];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		knapsack x = new knapsack();
		
//		String s = "1";
//		String t = "0";
//		s=s.concat("0");
//		System.out.println(s);
		
		int val[] = {60, 100, 120};
	    int wt[] = {10, 20, 30};
	    int  W = 50;
	    int n = val.length;
	    System.out.println("Answer is "+ x.knapSack(W, wt, val, n));

	}

}
