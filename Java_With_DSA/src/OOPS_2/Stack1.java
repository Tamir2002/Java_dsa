package OOPS_2;

public interface Stack1 extends DSAI ,DynamicStack1{
  public  void push();;
  public int pop();
  
  public int size();
  
  int val=9;// public static final
  
  // java 8 me public and default  and static  ko body dete hai
  default void Sayhey() {
	  System.out.println("hey");
  }
  public static void Sayehy1() {
	  System.out.println("hey");
  }
  private int fun1() {
	  return 9;
	  
  }
}
