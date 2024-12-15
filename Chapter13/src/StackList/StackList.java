package StackList;

public class StackList {
	private Node head;    
	private int size;   
    
    public StackList() {
        head = null;
        size = 0;
    }
    
    public void push(String obj) {
        Node newNode = new Node(obj);
        newNode.setNext(head);
        head = newNode;
        size++;
    }
    
    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        Object obj = head.getData();
        head = head.getNext();
        size--;
        return obj;
    }
    
    public Object top() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return head.getData();
    }
    
    // Check if stack is empty
    public boolean isEmpty() {
        return head == null;
    }
    
    public int size() {
        return size;
    }
    
    public void makeEmpty() {
        head = null;
        size = 0;
    }

}
