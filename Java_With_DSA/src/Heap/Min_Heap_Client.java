package Heap;

import java.util.PriorityQueue;

public class Min_Heap_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Min_Heap_First hp=new Min_Heap_First();
		hp.add(4);
		
		hp.add(7);
		hp.add(5);
		hp.add(1);
		hp.add(6);
		hp.add(9);
		hp.add(3);
		System.out.println(hp.get());
		hp.Display();
		System.out.println(hp.get());
		hp.Display();
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.add(4);
		pq.add(7);
		pq.add(5);
		pq.add(1);
		pq.add(6);
		pq.add(9);
		pq.add(3);
//		System.out.println(pq.peek());
//		System.out.println(pq);
		
		System.out.println(pq.poll());
		System.out.println(pq);

	}

}
