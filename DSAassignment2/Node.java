package DSAassignment2;

 class Node {
	 //class to create instances of this class, individual nodes in a list
	int data; //attributes or fields, holds value of associated fields
	Node next; //reference to next node in linked list
	    
	//constructor method
	public Node(int data) {
	   this.data = data; //data value to data field of current node
	   this.next = null; //no next node
 }
}

