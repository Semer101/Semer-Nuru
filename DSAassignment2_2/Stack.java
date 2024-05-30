package DSAassignment2_2;

public class Stack {
    private Node top; //top of stack

    public Stack() {
        top = null; //empty stack
    }
    //last in first out
    public void push(int data) {
        Node newNode = new Node(data); //newNode object created
        newNode.next = top; //sets the next node to current top
        top = newNode; //updates top to point to newNode
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; 
        }
        int poppedValue = top.data; //gets data from current top
        top = top.next; //updates top to point to the next node
        return poppedValue;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; //stack is empty
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
