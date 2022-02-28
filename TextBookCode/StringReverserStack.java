// Program using a Stack data structure to reverse a String
// Methods and structure
public class StackX {
	private int maxSize;
	private char[] stackArray;
	private int top;
	
	public StackX(int s) {
		maxSize = s;
		stackArray = new char[maxSize];
		top = -1;
	}
	
	public void push(char j) {
		stackArray[++top] = j;
	}
	
	public char pop() {
		return stackArray[top--];
	}
	
	public char peek() {
		return stackArray[top];
	}
	
	public Boolean isEmpty() {
		return (top == -1);
	}
	
	public Boolean isFull() {
		return (top == maxSize-1);
	}
}

// Reverser class
// Uses doRev method to create a stack and push all the items, then popping them, which will take them all out in reverse which is the action of a stack
public class Reverser {
	private String input;
	private String output;
	
	public Reverser(String in) {
		input = in;
	}
	
	public String doRev() {
		int stackSize = input.length();
		StackX theStack = new StackX(stackSize);
		
		for(int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			theStack.push(ch);
		}
		
		output = "";
		while(!theStack.isEmpty()) {
			char ch = theStack.pop();
			output = output + ch;
		}
		return output;
	}
}

// main() for testing
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {
	public static void main(String[] args) throws IOException {
		
		String input, output;
		
		while(true) {
			System.out.println("Enter a string: ");
			System.out.flush();
			input = getString();
			if(input.equals(""))
				break;
			
			Reverser theReverser = new Reverser(input);
			output = theReverser.doRev();
			System.out.println("Reversed: " + output);
		}
	}
	
	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
}

