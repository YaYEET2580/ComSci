package StackList;

import java.util.Scanner;

public class testStackList {

	public static void main(String[] args) {
		StackList sl = new StackList();
		String word;
		Scanner input = new Scanner(System.in);

		while (true) {
        	System.out.println("Please enter a number (enter 'S' to stop):");
        	word = input.next();
        	
        	if (word.equalsIgnoreCase("s")) {
        		break;
        	}
        	
        	sl.push(word);
        }
        
        System.out.println("\nCurrent size of the stack: " + sl.size());
        System.out.println("Top element: " + sl.top());
        System.out.println("\nObjects being popped from this stack list: ");
        while (!sl.isEmpty()) {
            System.out.println("Popped: " + sl.pop());
        }
        
        System.out.println("\nStack size after popping all elements: " + sl.size());

        try {
        	sl.pop();
        } catch (IllegalStateException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        
        input.close();
	}

}
