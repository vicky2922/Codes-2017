package julypractice;

import java.util.Scanner;

public class MS_minimumelementinasortedandrotatedarray {
	
	int search(int[] a, int n ){
		
		int low = 0;
		int high = n-1;
		int mid, prev, next;
	 
		while(low<=high){
	 
			mid = (low+high)/2;
			prev = (mid-1);
			next = (mid+1); 
	 
			if(a[mid]<a[prev] && a[mid]<a[next])
				return mid-1;
			else if(a[mid] < a[high]){
				high=mid-1;
			}
			else low=mid+1;
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MS_minimumelementinasortedandrotatedarray x = new MS_minimumelementinasortedandrotatedarray();
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ; i< n ; i++){
				a[i] = sc.nextInt();
			}
			int index;
			
			if(n==1){
				index = 0 ;
			}
			else{
				index = x.search(a,n);
			}
			System.out.println("@ point " + index);
			
		}

	}

}
