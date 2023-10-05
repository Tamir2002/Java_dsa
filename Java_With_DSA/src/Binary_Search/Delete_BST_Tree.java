package Binary_Search;

public class Delete_BST_Tree {
	public class TreeNode {
		     int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode() {}
		      TreeNode(int val) { this.val = val; }
		      TreeNode(int val, TreeNode left, TreeNode right) {
		          this.val = val;
		          this.left = left;
		          this.right = right;
		      }
		  }
	class Solution {
	    public TreeNode deleteNode(TreeNode root, int key) {
	    	
	    	if(root==null) {
	    		return root;
	    	}
	       if(root.val<key) {
	    	   root.right=deleteNode(root.right,key);
	    	   
	       }
	       else if(root.val>key) {
	    	   root.left=deleteNode(root.left,key);
	       
	    	   // element mil gya delete node
	       
	       }
	       else {
	    	   // 1 child
	    	   if(root.left==null) {
	    		   return root.right;
	    		   
	    	   }
	    	   else if(root.right==null) {
	    		   return root.left;
	    	   }
	    	   else {
	    		   int lmax=max(root.left);
	    		  root.left=deleteNode(root.left,lmax);
	    		   root.val=lmax;
	    	   }
	    	   
	       }
	       return root;
	       
	       
	      }
	    
	    public int max(TreeNode root) {
	    	if(root==null) {
	    		return Integer.MIN_VALUE;
	    	}
	    	int r=max(root.right);
	    	return Math.max(root.val, r);
	    }
	   
	    }
}
