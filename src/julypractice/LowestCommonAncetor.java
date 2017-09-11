package julypractice;

import julypractice.BinarySearchTree.Node;

public class LowestCommonAncetor {
	
	class Node{
		int key;
		Node left,right;
		Node(int item){
			key = item;
			left = right = null;
		}
	}
	
	Node root;
	
	LowestCommonAncetor() {
		root = null;
	}
	
	void insert(int key){
		root = insertRec(root, key);
	}
	
	Node insertRec(Node root, int key){
		if (root == null) {
            root = new Node(key);
            return root;
        }
		
		if(key < root.key){
			root.left = insertRec(root.left, key);
		}
		else if (key > root.key)
            root.right = insertRec(root.right, key);
		
		return root;
	}
	
	Node lca(Node node, int n1, int n2) 
    {
        if (node == null)
            return null;
  
        // If both n1 and n2 are smaller than root, then LCA lies in left
        if (node.key > n1 && node.key > n2)
            return lca(node.left, n1, n2);
  
        // If both n1 and n2 are greater than root, then LCA lies in right
        if (node.key < n1 && node.key < n2) 
            return lca(node.right, n1, n2);
  
        return node;
    }
	
	//finding parent of both node which merging in one node
	
	
	public static void main(String[] args) {
		
		LowestCommonAncetor tree = new LowestCommonAncetor();
		
		tree.insert(20);
        tree.insert(8);
        tree.insert(22);
        tree.insert(4);
        tree.insert(12);
        tree.insert(10);
        tree.insert(14);
        
        int n1 = 10, n2 = 14;
        Node t = tree.lca(tree.root, n1, n2);
        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.key);

	}

}
