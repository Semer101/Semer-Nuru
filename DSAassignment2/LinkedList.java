package DSAassignment2;

public class LinkedList {
    public Node head;
    public int size;
    public int data; //attributes
    
    //constructor
    public LinkedList() {
        head = null; //empty linked list
        size = 0; //position
    }
    
  //1.Inserting a node at any given position in a singly linked list:
    public void insertAtPos(int data, int pos) {
    	//check position is within valid range
        if (pos < 1 || pos > size + 1) {
            System.out.println("Invalid position!");
            return;
        }

        Node newNode = new Node(data); //new node object initialization
        newNode.data = data;

        //insert at beginning of list
        if (pos == 1) {
            newNode.next = head; //next pointer of newNode set to current head
            head = newNode; //head is now newNode
        } else {
            Node current = head; //initialize current to beginning or head
            for (int i = 1; i < pos - 1; i++) {
                current = current.next; //current moved to just before desired position(pos-1)
            }
            newNode.next = current.next; //newNode.next set to node pointed to by current.next
            //this is make sure to have the pointer of the value after the desired position
            current.next = newNode; //newNode is at pos(current.next) here (pos - 1 = current)
        }

        size++;//position increases as nodes are added (no. of nodes)
    }

    public void displayList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
  //2.Deleting a node at any given position in a singly linked list:
    public void deleteAtPosition(int pos) {
    	//out of range
        if (pos < 1 || pos > size) {
            System.out.println("Invalid position!");
            return;
        }
        
        if (pos == 1) {
            head = head.next; //deleting first node, update head to next node
        } else {
            Node current = head; //starting point
            for (int i = 1; i < pos - 1; i++) {
                current = current.next; //current pointer at pos - 1
            }
            current.next = current.next.next; //skip the pos of node to be deleted
        }

        size--; //decrement
    }

  //3.Deleting a node after a given node in a singly linked list
    public void deleteAfterNode(Node prevNode) {
    	//check for valid prevNode and its pointer using boolean (not last node)
        if (prevNode == null || prevNode.next == null) {
            System.out.println("Invalid previous node!");
            return;
        }

        Node nodeToDelete = prevNode.next; //node to delete after prevNode
        prevNode.next = nodeToDelete.next; //skip nodeToDelete
        nodeToDelete = null; // Free memory, garbage collector in java reclaims the memory for unreachable objects

       }
    
    //4.Searching a node in a singly linked list
    public int searchNode(int element) {
        Node current = head; //initialize current pointer to head
        int index = 1; //index position of current node
        //traverse list:
        while (current != null) {
            if (current.data == element) {
                return index;
            }
            current = current.next;
            index++;
        }

        return -1; //if not found in list
    }
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtPos(3, 1);
        list.insertAtPos(5, 2);
        list.insertAtPos(8, 3);
        list.insertAtPos(10, 4);

        //insertion at position
        System.out.print("Linked list before insertion: ");
        list.displayList();
        list.insertAtPos(12, 3);
        System.out.print("Linked list after insertion of 12 at position 3: ");
        list.displayList();
        list.insertAtPos(1, 1);
        System.out.print("Linked list after insertion of 1 at position 1: ");
        list.displayList();
        System.out.println("\n");     
        
        //deletion at position
        System.out.print("Linked list before deletion: ");
        list.displayList();
        list.deleteAtPosition(3);
        System.out.print("Linked list after deleting node at position 3: ");
        list.displayList();
        list.deleteAtPosition(1);
        System.out.print("Linked list after deleting node at position 1: ");
        list.displayList();
        System.out.println("\n");
        
        //deletion after a given node
        System.out.print("Linked list before deletion: ");
        list.displayList();
        // Assuming we want to delete the node after the second node
        Node prevNode = list.head.next;
        list.deleteAfterNode(prevNode);
        System.out.print("Linked list after deletion: ");
        list.displayList();
        System.out.println("\n");
        
        //searching a node
        int elementToSearch = 3;
        int result = list.searchNode(elementToSearch);
        if (result != -1) {
            System.out.println("Element " + elementToSearch + " found in the Linked List at position " + result);
        } else {
            System.out.println("Element " + elementToSearch + " not found in the Linked List");
        }
        
    }
  }




