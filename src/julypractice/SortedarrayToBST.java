package julypractice;

public class SortedarrayToBST {

	class Node{
		int key;
		Node left, right;
		
		Node(int item){
			key = item;
			left = right =null;
		}
	}
	static Node root;
	
	Node SAToBST(int[] a,int left,int right){
		if(left > right){
			return null;
		}
		int mid = (left+right)/2;
		
		Node node = new Node(a[mid]);
		
		node.left = SAToBST(a,left,mid-1);
		node.right = SAToBST(a,mid+1,right);
		
		return node;
		
	}
	
	 void preOrder(Node node) {
	        if (node == null) {
	            return;
	        }
	        System.out.print(node.key + " ");
	        preOrder(node.left);
	        preOrder(node.right);
	    }
	
	public static void main(String[] args) {
		
		SortedarrayToBST tree = new SortedarrayToBST();
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        root = tree.SAToBST(arr, 0, n - 1);
		
        System.out.println("Preorder traversal of constructed BST");
        tree.preOrder(root);
        
	}

}
