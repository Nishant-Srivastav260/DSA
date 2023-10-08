package Hashmap;
import java.util.*;
import java.io.*;

public class MedianPriorityQueue8 {
	
	PriorityQueue<Integer> left= new PriorityQueue<>(Collections.reverseOrder());
	PriorityQueue<Integer> right= new PriorityQueue<>();
	
	public int size() {
		return left.size()+right.size();
	}
	
	public void add(int val) {
		if(right.size()>0 && val> right.peek()) {
			right.add(val);
			
		}
		else left.add(val);
		if(left.size()-right.size()==2)
		{
			right.add(left.remove());
		}
		else if(right.size()-left.size()==2) {
			left.add(right.remove());
		}
	}
	public int peek() {
		if(this.size()==0) {
			System.out.println("underflow");
			return -1;
		}
			
		if(left.size()>=right.size()) {
			return left.peek();
		}
		else return right.peek();
		
	}
	public int remove() {
		if(this.size()==0) {
			System.out.println("underflow");
			return -1;
		}
			
		if(left.size()>=right.size()) {
			return left.remove();
		}
		else return right.remove();
		
		
	}
	
	

	
	
}
	

