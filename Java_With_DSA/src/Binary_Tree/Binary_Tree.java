package Binary_Tree;
import java.util.*;
public class Binary_Tree {
	Scanner sc=new Scanner(System.in);
	
	public class Node{	
	int data;
	Node left;
	Node right;
	}
	
	private Node root;
	public Binary_Tree() {
		this.root=CreateTree();
	}
	private Node CreateTree() {
		int item=sc.nextInt();
		Node nn= new Node();
		nn.data=item;
		boolean hlc=sc.nextBoolean();
		if(hlc==true) {
			nn.left=CreateTree();
			
		}
		boolean hlr=sc.nextBoolean();
		if(hlr==true) {
			nn.right=CreateTree();
		}
		return nn;
	}
	
	public void Display() {
		Display(this.root);
	}
	private void Display(Node nn) {
		
		if(nn==null) {
			return;
		}
		
		
		String str="";
		str=str+nn.data;
		str="<--"+ str +"-->";
		if(nn.left!=null) {
			str=nn.left.data+str;
		}
		else {
			str="."+str;
		}
		if(nn.right!=null) {
			str= str+nn.right.data;
		}
		else {
			str=str+ ".";
		}
		System.out.println(str);
		Display(nn.left);//left subtree visit
		Display(nn.right);//right subtree visit
	}
	public int max() {
		return max(this.root);
	}
	private int  max(Node node) {
		if(node==null) {
			return Integer.MIN_VALUE;
		}
		
		int lmax=max(node.left);
		int rmax=max(node.right);
		return Math.max(lmax, Math.max(rmax, node.data));
		
	}
	public boolean find(int item) {
		
		return find(this.root,item);
	}
	private boolean find(Node nn,int item) {
		
		
		if(nn==null) {
			return false;
		}
		
		if(nn.data==item) {
			return true;
		}
		 return find(nn.left,item) || find(nn.right,item);

	}
	public int min() {
		return min(this.root);
	}
	private int min(Node node) {
		if(node==null) {
		return Integer.MAX_VALUE;
	}
	int lmin=min(node.left);
	int rmin=min(node.right);
	return Math.min(lmin,Math.min(rmin,node.data));

 }
	public int height() {
		return height(this.root);
	}
	private int height(Node node) {
		if(node==null) {
			return -1;
		}
		
		int lheight=height(node.left);
		int rheight=height(node.right);
		return Math.max(lheight, rheight)+1;
		
		
		
	}
	
}
