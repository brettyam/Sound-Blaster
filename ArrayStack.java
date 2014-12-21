//Brett Yamada, CSE 373 Winter 2014, Homework #1
//This class implements a stack ADT through the use of an array
//and follows the "first in, last out" rule of a stack.

import java.util.EmptyStackException;

public class ArrayStack implements DStack {
	private double[] stack;	//array that will be used as a stack
	private int size; 		//amount of elements in the stack, not the length of the array

	//constructs an array stack
	public ArrayStack() {
		this.stack = new double[10]; 
		this.size = 0;
	}
	
	//returns the size of the stack
	public int getSize() {
		return this.size;
	}
	
	//returns a string representation of the stack
	public String toString() {
		if (this.isEmpty()) {
			return "top [] bottom";
		} else {
			String result = "top [" + stack[size - 1];
			for (int i = size - 2; i >= 0; i--) {
				result += ", " + stack[i];
			}
			return result + "] bottom";
		}
	}
	
	//returns whether the stack is empty
	public boolean isEmpty() {
		return (this.size == 0);
	}

	//adds the given value to the top of the stack
	public void push(double d) {
		stack[this.size] = d;
		this.size++;
		//if the array is full, move stack to new array with double the size
		if (this.size == this.stack.length) {
			double[] bigStack = new double[this.stack.length * 2]; 
			for (int i = 0; i < this.stack.length; i++) {
				bigStack[i] = this.stack[i];
			}
			this.stack = bigStack;
		}
	}

	//throws an error if the stack is empty
	//removes and returns the value at the stop of the stack
	public double pop() {
		if (this.isEmpty()) {
			throw new EmptyStackException();
		}
		double removedItem = this.stack[size - 1];
		this.stack[size - 1] = stack[stack.length - 1];
		this.size--;
		return removedItem;
	}

	//throws an error if the stack is empty
	//returns the value at the top of the stack but does not remove it
	public double peek() {
		if (this.isEmpty()) {
			throw new EmptyStackException();
		}
		return this.stack[size - 1];
	}
}
