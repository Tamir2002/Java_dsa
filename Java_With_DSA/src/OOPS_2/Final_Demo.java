package OOPS_2;

public class Final_Demo {
	
	final int val=89;//constant
	public void fun() {
		val=val+7;// not update value due to final keyword
		System.out.println(val);
	}

}
