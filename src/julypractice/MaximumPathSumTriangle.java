package julypractice;

import java.util.Scanner;

public class MaximumPathSumTriangle {
	
	int maxsum(int[][] tri,int m, int n){
		for(int i = m-1; i >=0 ;i-- ){
			for(int j = 0 ; j<n ;j++){
				if(tri[i+1][j] > tri[i+1][j+1]){
					tri[i][j] += tri[i+1][j];
				}
				else{
					tri[i][j] += tri[i+1][j+1];
				}
			}
		}
		return tri[0][0];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		MaximumPathSumTriangle x= new MaximumPathSumTriangle();
		
		Scanner sc = new Scanner(System.in);
		
		int[][] tri = { {1, 0, 0},
                		{4, 8, 0},
                		{1, 5, 3} 
                		};
		System.out.println(x.maxsum(tri,2,2));

	}

}
