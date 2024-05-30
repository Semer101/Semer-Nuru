package DSAassignment1;

public class Task {
	//attributes or fields:
	private String title;
	private String description;
	private boolean completed;
	
	//constructor
	public Task(String title, String description) {
		this.title = title;
		this.description = description;
		this.completed = false;
	}
	
	//methods:
	public String getTitle() {
		return title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public boolean isCompleted() {
		return completed;
	}
	
	public void markCompleted() {
		completed = true;
	}
 
	//descriptive string representation of an object, displays info about instances of a class
	public String toString() {
		return "Title: " + title + ", Description: " + description + ", Completed: " + completed;
	}
	
}
