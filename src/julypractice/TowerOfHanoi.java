package julypractice;
//import for Scanner and other utility  classes
import java.util.*;
//Use of Comparator
//Use of Longest Increasing Sequence (DP)

class TowerOfHanoi {
  static long maximum(long a,long b){
      return a>b?a:b;
  }
  
  public static void main(String args[] ) throws Exception {
      
      //Scanner
      Scanner s = new Scanner(System.in);
      
      int t = s.nextInt();
      while(t--!=0){
          int n = s.nextInt();
          long r,h;
          long[] dp = new long[n];
          
          ArrayList<Node> toh = new ArrayList<Node>();
          
          for(int i = 0 ; i < n ; i++){
              r = s.nextLong();
              h = s.nextLong();
              toh.add( new Node( r, h ));
              //dp[i] = h;
              //System.out.print(dp[i]+" ");
          }
          Collections.sort(toh);
          int z=0;
          for(Node Z : toh){
              dp[z] = Z.hei;
             // System.out.print(dp[z]+" ");
              z++;
          }
          
          
          for(int i = 1 ; i < n ;i++){
              Node one = (Node) toh.get(i);
			   // System.out.println(one.rad+" "+one.hei);
              for(int j = 0; j<i;j++){
                  Node two = (Node) toh.get(j);
                 // System.out.println(two.rad+" "+two.hei);
                  if(two.hei < one.hei && two.rad < one.rad){
                      dp[i] = maximum(dp[i], dp[j] + one.hei);
                  }
              }
          }
          long max = dp[0];
          for (int i = 1; i < n; i++ )
            if ( max < dp[i] )
                  max = dp[i];
          
          System.out.println(max);
      }
  }
  
  static class Node implements Comparable<Node>
	{
		long rad;
		long hei;
		Node(long r,long h)
		{
			rad = r;
			hei = h;
		}
		public int compareTo(Node node)
		{
		    if(this.rad-node.rad < 0){
		        return -1;
		    }
		    else if(this.rad-node.rad == 0){
		        return 0;
		    }
		    else{
		        return 1;
		    }
		}
	}
  
  
}
