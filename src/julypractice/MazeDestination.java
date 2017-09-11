package julypractice;

import java.util.Scanner;

public class MazeDestination {
	
	int countpath(int[][] maze, int m , int n)
	{
		for(int i = 1 ; i < n ;i++ ){
			if(maze[0][i] == 0){
				maze[0][i] = 1;
			}
			else{
				break;
			}
		}
		
		for(int i = 0 ; i < m ; i++){
			if(maze[i][0] == 0){
				maze[i][0] = 1;
			}
			else{
				break;
			}
		}
		
		
		for(int i = 1 ; i < m  ;  i++){
			for(int j = 1 ; j< n ; j++){
				if(maze[i][j] == -1){
					continue;
				}
				if(maze[i][j-1] > 0){
					maze[i][j] += maze[i][j-1];
				}
				if(maze[i-1][j] > 0 ){
					maze[i][j] += maze[i-1][j];
				}
			}
		}
		
		return maze[m-1][n-1]>0 ? maze[m-1][n-1] : 0;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MazeDestination x = new MazeDestination();
		
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] maze = new int[m][n];
		
		for(int i = 0 ; i < m ; i++){
			for(int j = 0 ; j < n ; j++){
				maze[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("No of paths are : "+ x.countpath(maze,m,n));
	}

}
/* output :
4
4
0 0 0 0
0 -1 0 0 
-1 0 0 0 
0 0 0 0
No of paths are : 4
*/
