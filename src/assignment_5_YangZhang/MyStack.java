package assignment_5_YangZhang;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
	Queue<Integer> q1 = new LinkedList<Integer>(); 
	Queue<Integer> q2 = new LinkedList<Integer>();
	
	public void push(Integer x){
		q1.add(x);
	}
	
	public Integer pop() throws Exception{
	    if (q1.isEmpty()){
	        throw new Exception("Trying to pop an empty stack");
	    }
	    
		Integer a = null;
		while(q1.size() > 1){
			a = q1.poll();
			q2.add(a);
		}
		a = q1.poll();
		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;
		System.out.println("pop "+a);
		return a;
	}
	
	public Integer top(){
		Integer a = null;
		while(!q1.isEmpty()){
			a = q1.poll();
			q2.add(a);
		}
		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;
		System.out.println("top is "+a);
		return a;
	}
	
	public boolean empty(){
		return q1.isEmpty();
	}
	
	public static void main(String[] args) throws Exception {
		MyStack test = new MyStack();
		
		test.push(3);
		test.push(4);
		test.push(5);
		test.push(6);
		test.push(7);
		test.push(8);
		test.top();
		test.pop();
		test.pop();
		test.pop();
		test.pop();
		test.pop();
		test.pop();
		test.pop();
		
		System.out.println(test.empty());
		
		while(!test.q1.isEmpty()){
			int b = test.q1.poll();
			System.out.println(b);
		}
		
	}
}
