package java2;

	class Node {
	    int data;
	    Node next;

	    Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	public class Singlelinkedlist {
	    Node head;

	    // Insert at end
	    public void insert(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        Node current = head;
	        while (current.next != null)
	            current = current.next;
	        current.next = newNode;
	    }

	    // Insert at beginning
	    public void insertAtBeginning(int data) {
	        Node newNode = new Node(data);
	        newNode.next = head;
	        head = newNode;
	    }

	    // Delete by value
	    public void delete(int key) {
	        if (head == null) return;

	        if (head.data == key) {
	            head = head.next;
	            return;
	        }

	        Node current = head;
	        while (current.next != null && current.next.data != key)
	            current = current.next;

	        if (current.next != null)
	            current.next = current.next.next;
	    }

	    // Search for a value
	    public boolean search(int key) {
	        Node current = head;
	        while (current != null) {
	            if (current.data == key)
	                return true;
	            current = current.next;
	        }
	        return false;
	    }

	    // Display the list
	    public void display() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " -> ");
	            current = current.next;
	        }
	        System.out.println("null");
	    }

	    // Get length of the list
	    public int length() {
	        int count = 0;
	        Node current = head;
	        while (current != null) {
	            count++;
	            current = current.next;
	        }
	        return count;
	    }

	    public static void main(String[] args) {
	        Singlelinkedlist list = new Singlelinkedlist();

	        list.insert(10);
	        list.insert(20);
	        list.insert(30);
	        list.insertAtBeginning(5);
	        list.display(); // Output: 5 -> 10 -> 20 -> 30 -> null

	        System.out.println("Length: " + list.length()); // Output: 4

	        list.delete(20);
	        list.display(); // Output: 5 -> 10 -> 30 -> null

	        System.out.println("Search 10: " + list.search(10)); // Output: true
	        System.out.println("Search 100: " + list.search(100)); // Output: false
	    }
	}