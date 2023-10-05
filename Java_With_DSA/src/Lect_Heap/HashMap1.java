package Lect_Heap;
import java.util.*;
public class HashMap1<K,V> {
	public class Node{
	 K key;
	 V  value;
	 Node next;
	 public Node() {
		 
	 }
	 Node(K key,V value){
		 this.key=key;
		 this.value=value;
	 }

  }
	
	private ArrayList<Node> bucktarray;
	 private int size=0;
	
	public HashMap1(int x) {
		
		this.bucktarray=new ArrayList<>();
		for (int i=0; i<x; i++) {
			this.bucktarray.add(null);
			
		}
	}
	public HashMap1() {
		this(4);
	}
	public  void put(K key,V value) {
		int bn=hashfunction(key);
		Node temp=this.bucktarray.get(bn);// 1st Address
		while(temp!=null) {
			if(temp.key.equals(key)) {
				temp.value=value;
				return;
				
			}
			temp=temp.next;
		}
		Node nn=new Node(key,value);
		temp=this.bucktarray.get(bn);
		nn.next=temp;
		this.bucktarray.set(bn, nn);
		this.size++;
		double lf=(1.0+this.size)/this.bucktarray.size();
		double thf=2.0;
		if(lf>thf) {
			rehasing();
		}
	}
	private void rehasing() {
		ArrayList <Node> nba=new ArrayList<>();
		for (int i = 0; i <this.bucktarray.size(); i++) {
			nba.add(null);
		}
		ArrayList<Node> oba=this.bucktarray;
		this.bucktarray=nba;
		this.size=0;
		for(Node node:oba) {
			while(node!=null) {
                put(node.key,node.value);
				node=node.next;
				
			}
		}
	}
	
	public V get(K key) {
		int bn=hashfunction(key);
				Node temp=this.bucktarray.get(bn);//1st address
				while(temp!=null) {
					if(temp.key.equals(key)) {
						return temp.value;
						
					}
					temp=temp.next;
				}
				return null;
			}
	
	public boolean containsKey(K key) {
	
			int bn=hashfunction(key);
					Node temp=this.bucktarray.get(bn);//1st address
					while(temp!=null) {
						if(temp.key.equals(key)) {
							return true;
							
						}
						temp=temp.next;
					}
					return false;
				}
	
	
	public V remove(K key) {
		int bn=hashfunction(key);
		Node curr=this.bucktarray.get(bn);
		Node prev=null;
		while(curr!=null) {
			if(curr.key.equals(key)) {
				break;
			}
			prev =curr;
			curr =curr.next;
		}
		if(curr==null) {
			return null;
		}
		 this.size--;
		 if(prev==null) {
			 this.bucktarray.set(0,curr.next);
			 curr.next=null;
		 }
		 else {
			 prev.next=curr.next;
		 }
		 return curr.value;
	}
	
		
	
	public int hashfunction(K key) {
		int bn=key.hashCode()%this.bucktarray.size();
		if(bn<0) {
			bn+=this.bucktarray.size();
		}
		return bn;
	}
	@Override
	public String toString() {
		String s="{";
		for(Node node:bucktarray) {
			while(node!=null) {
				s=s+node.key+"="+node.value+",";
				node=node.next;
				
			}
		}
		s=s+"}";
		return s;
	}
}
