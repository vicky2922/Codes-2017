package AugustSolved;

/*
 * https://www.codechef.com/SEPT17/problems/SEACO
 * Partially accepted
 */
import java.util.Arrays;
import java.util.Scanner;

public class codechef_seaco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			long[][] arr = new long[m+1][n+1];
			
			//Arrays.fill(arr, 0);
			
			for(int i = 1 ; i < m+1; i++){
				for(int j = 1 ; j < n+1 ;j++){
					arr[i][j] = 0;
				}
			}
			/*for(int i = 1 ; i < n+1 ; i++ ){
				System.out.print(arr[i][m]+" ");
			}*/
			for(int i = 1 ; i < m+1 ; i++){
				int c = sc.nextInt();
				int l = sc.nextInt();
				int r = sc.nextInt();
				
				if(c==1){
					/*arr[i][l]++;
					arr[i][r]++;*/
					
					for(int x = l; x <= r; x++){
						arr[i][x]++;
					}
				}
				else{
					for(int x = l; x <= r; x++){
						for(int j = 1 ; j < n+1 ; j++){
							arr[i][j] += arr[x][j];
						}
					}
				}
				
				
			}
			
			
			
			for(int i = 1 ; i < m+1; i++){
				for(int j = 1 ; j < n+1 ;j++){
					if(i==1){
						
					}
					else{
						arr[i][j] = (long) ((arr[i][j] + arr[i-1][j])% (Math.pow(10, 9)+7));
					}
				}
			}
			
			for(int i = 1 ; i < n+1 ; i++ ){
				System.out.print(arr[m][i]+" ");
			}
			System.out.println();
			
		}

	}

}
