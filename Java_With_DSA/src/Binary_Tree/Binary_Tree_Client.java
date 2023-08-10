package Binary_Tree;

public class Binary_Tree_Client {
	  // 10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binary_Tree bt=new Binary_Tree();
		bt.Display();
		System.out.println("The maximum vaule is: "+bt.max());
		System.out.println("The minimum item is:"+bt.min());
		System.out.println("Find the item 32 is:"+bt.find(32));
		System.out.println("maximum tree height is:"+bt.height());

	}

}
