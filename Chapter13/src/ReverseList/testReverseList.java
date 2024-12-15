package ReverseList;

import java.util.Scanner;

public class testReverseList {
	public static void main(String[] args) {
		ReverseList rl = new ReverseList(10);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int number;
		
		
        while (true) {
        	System.out.println("Please enter a number (enter 999 to stop):");
        	number = input.nextInt();
        	
        	if (number == 999) {
        		break;
        	}
        	
        	rl.push(number);
        }
        
        System.out.println("\nNumbers in reverse order:");
        while (!rl.isEmpty()) {
            System.out.print(rl.pop() + " ");
        }
       
        
        
	}
	
	
	
}
