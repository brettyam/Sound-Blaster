//Brett Yamada, CSE 373 Winter 2014, Homework #1
//This class implements a single node of the ListStack. It will be used to 
//store individual values of data. For this particular, assignment they will be 
//numerical values between -1.0 and 1.0, necessary for music sampling. 

public class ListStackNode {
	public double data;			//a value between -1.0 and 1.0
	public ListStackNode next;	//the next node in the list
	
	//constructs a ListStackNode without a next node given
	public ListStackNode(double num) {
		this(num, null);
	}
	
	//constructs a ListStackNode with the given data and 
	//a given ListStack Node to link to
	public ListStackNode(double num, ListStackNode next) {
		this.data = num;
		this.next = next;
	}
}
