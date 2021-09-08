package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;


public class GetMinStackO1Complexity {

	public static void main(String[] args) {
	
		MyStack stack = new MyStack ();
		
		stack.push(20);
		stack.push(30);
		System.out.println(stack.getMin());;
		
Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        
        verticalOrder(hd, root, map);
        List<Integer> result = new ArrayList<Integer> ();
            for(Entry<Integer, List<Integer>> entry: map.entrySet()){
                result.addAll(entry.getValue());
            }

	}
	


}


class MyStack{
	
	Stack<Integer> stack = new Stack<Integer>();
	Stack<Integer> minStack = new Stack<Integer>();
	
	
	public void push(int i) {
		
		if(stack.isEmpty()) {
			stack.push(i);
			minStack.push(i);
		}else
			if(i < minStack.peek()) {
				minStack.push(i);
				stack.push(i);
			} else {
				stack.push(i);
			}
	}
	public int pop() {
		
		if(stack.peek() == minStack.peek()) {
			minStack.pop();
		}
		return stack.pop();
	}
	
	public int getMin() {
		if(!minStack.isEmpty())
			return minStack.pop();
		else 
			return -1;
	}
}
