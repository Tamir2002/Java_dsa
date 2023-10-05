package Binary_Tree;

public class Balanced_Binary_TreeLeetcode {
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode() {
		    	  
		      }
		      TreeNode(int val) { 
		    	  this.val = val;
		    	  }
		      TreeNode(int val, TreeNode left, TreeNode right) {
		          this.val = val;
		          this.left = left;
		          this.right = right;
		      }
		 }
	
	public class BlanacedPair{
		boolean  isbal=true;
		int ht=-1;
	}
	class Solution{
		public boolean isBalanced(TreeNode root) {
			return isBalancedpair(root).isbal;
			
		}
		public BlanacedPair isBalancedpair(TreeNode root) {
			
			if(root==null) {
				return new BlanacedPair();
			}
			
			BlanacedPair lbp=isBalancedpair(root.left);
			BlanacedPair rbp=isBalancedpair(root.right);
			
			BlanacedPair sbp=new BlanacedPair();
			sbp.ht=Math.max(lbp.ht, rbp.ht)+1;
			int bf=Math.abs(lbp.ht-rbp.ht);
			
			sbp.isbal=lbp.isbal && rbp.isbal &&bf<=1;
			return sbp;
		}
	}
	
}
