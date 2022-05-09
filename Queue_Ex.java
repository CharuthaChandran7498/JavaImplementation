package Javapkg;
import java.util.*;
public class Queue_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        for(int i=10;i>=1;i--)
        {
        	pq.add(i);
        }
        System.out.println(pq);
        System.out.println("size of priority queue is:"+pq.size());
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.peek());
        
        
	}

}
