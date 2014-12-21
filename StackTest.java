public class StackTest {
	public static void main(String[]args) {
		ArrayStack stack1 = new ArrayStack();	//create an empty ArrayStack
		System.out.println(stack1.isEmpty());	//should return true - check
		System.out.println(stack1.toString());	//should return [] - check
		System.out.println(stack1.getSize());	//should return 0 - check
		stack1.push(1.0);
		stack1.push(3.0);
		stack1.push(5.0);
		System.out.println(stack1.toString());	//should return [5.0, 3.0, 1.0] - check
		stack1.push(7.0);
		stack1.push(9.0);
		stack1.push(1.0);
		stack1.push(9.0);
		stack1.push(3.0);
		stack1.push(4.0);
		stack1.push(2.0);
		stack1.push(6.0);
		System.out.println(stack1.toString());	//should return [6.0, 2.0, 4.0, 3.0, 9.0, 1.0, 9.0, 7.0, 5.0, 3.0, 1.0] - check
		System.out.println(stack1.isEmpty());	//should return false - check
		System.out.println(stack1.pop());		//should return 6.0 - check
		System.out.println(stack1.pop());		//should return 2.0 - check
		System.out.println(stack1.pop());		//should return 4.0 - check
		System.out.println(stack1.toString());	//should return [3.0, 9.0, 1.0, 9.0, 7.0, 5.0, 3.0, 1.0] - check
		System.out.println(stack1.peek());		//should return 3.0
		System.out.println(stack1.getSize());	//should return 8 - check
		//push(), pop(), and peek() all work and the array is doubling in size when needed

		
		ListStack stack2 = new ListStack();		//create an empty ListStack
		System.out.println(stack2.isEmpty());	//should return true - check
		System.out.println(stack2.getSize());	//should return 0 - check
		System.out.println(stack2.toString());	//should return [] - check
		stack2.push(1.0);
		System.out.println(stack2.isEmpty());	//should return false - check
		System.out.println(stack2.peek());		//should return 1.0 - check
		stack2.push(9.0);
		System.out.println(stack2.peek());		//should return 9.0 - check
		System.out.println(stack2.toString());	//should return [9.0, 1.0] - check
		stack2.push(3.0);
		stack2.push(5.0);
		stack2.push(7.0);
		System.out.println(stack2.toString());	//should return [7.0, 5.0, 3.0, 9.0, 1.0] - check
		System.out.println(stack2.peek());		//should return 7.0 - check
		System.out.println(stack2.pop());		//should return 7.0 - check
		System.out.println(stack2.pop());		//should return 5.0 - check
		System.out.println(stack2.toString());	//should return [3.0, 9.0. 1.0] - check
		//push(), pop(), peek() all work
	}
}