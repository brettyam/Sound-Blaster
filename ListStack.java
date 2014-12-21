//Brett Yamada, CSE 373 Winter 2014, Homework #1
//This class implements a stack ADT through the use of a linked list
//and follows the "first in, last out" rule of a stack.

import java.util.EmptyStackException;

public class ListStack implements DStack {
	private ListStackNode top;		//the element at the top of the stack
	private int size; 				//the amount of elements in the stack
	
	//constructs a ListStack
	public ListStack() {
		this.top = null;
		this.size = 0;
	}
	
	//returns the size of the stack
	public int getSize() {
		return size;
	}
	
	//returns a string representation of the stack
	public String toString() {
		if (this.isEmpty()) {
			return "top [] bottom";
		} else {
			String result = "top [" + top.data;
			ListStackNode current = top.next;
			while (current != null) {
				result += ", " + current.data;
				current = current.next;
			}
			return result + "] bottom";
		}
	}
	
	//returns whether the stack is empty 
	public boolean isEmpty() {
		return (top == null);
	}

	//adds the given value to the top of the stack
	public void push(double d) {
		if (this.isEmpty()) {
			top = new ListStackNode(d);
		} else {
			ListStackNode temp = new ListStackNode(d, top);
			top = temp;
		}
		this.size++;
	}

	//throws an error if the stack is empty
	//removes and returns the value at the top of the stack 
	public double pop() {
		if (this.isEmpty()) {
			throw new EmptyStackException();
		}
		ListStackNode removed = top;
		top = top.next;
		this.size--;
		return removed.data;
	}

	//throws an error if the stack is empty
	//returns the value at the top of the stack but does not remove it
	public double peek() {
		if (this.isEmpty()) {
			throw new EmptyStackException();
		}
		return this.top.data;
	}

}
