package DSAassignment1;

public class ToDoList {
   private Node head;
   
   public ToDoList() {
	   head = null;
   }
    
   public void addToDo(Task task) {
    	Node newNode = new Node(task);
    	if (head == null) {
    		head = newNode;
    	}
    	else {
    		Node current = head; //traverse list till last node
    		while(current.next != null) {
    			current = current.next;
    		}
    		current.next = newNode; //node added at the end
    	}
    }
   
   public void markToDoAsCompleted(String title) {
	   Node current = head; //traverses list  to find matching title
	   while(current != null) {
		   //access title of current node and compare to given title
		   if(current.task.getTitle().equals(title)) {
			   current.task.markCompleted();
			   return;
		   }
		   current = current.next;//next nodes in while loop
	   }
	   System.out.println("Task not found");
   }
	
   public void viewToDoList() {
	   Node current = head;
	   System.out.println("To Do List: ");
	   while(current != null) {
		   System.out.println(current.task); //Task class has toString method to display info about instance of Task class(i.e task)
		   current = current.next; //display all tasks
	   }
   }
	
	
	public static void main(String[] args) {
		ToDoList toDoList = new ToDoList();
		
		toDoList.addToDo(new Task("Homework", "Maths pg 75"));
		toDoList.addToDo(new Task("Reading", "15 pgs per day"));
		
		toDoList.viewToDoList();
		
		toDoList.markToDoAsCompleted("Homework");
		
		toDoList.viewToDoList();
		
		

	}

}
