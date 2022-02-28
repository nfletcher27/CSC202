// Similar to reverse String, we take advantage of our Stack data structure methods to check if a String has proper opening and closing delimiter brackets
// BracketChecker class
// Creates a stack and checks each position, using our second variable which pops our next value so we check to see if brackets are closing correctly
public class BracketChecker {
	private String input;
	
	public BracketChecker(String in) {
		input = in;
	}
	
	public void check() {
		int stackSize = input.length();
		StackX theStack = new StackX(stackSize);
		
		for(int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			switch(ch) {
			case '{':
			case '[':
			case '(':
				theStack.push(ch);
				break;
			case '}':
			case ']':
			case ')':
				if(!theStack.isEmpty()) {
					char chx = theStack.pop();
					if((ch == '}' && chx != '{') || (ch == ']' && chx != '[') || (ch == ')' && chx != '(')) System.out.println("Error");
				}
				else
					System.out.println("Error");
				break;
			default:
				break;
			}
		}
		if(!theStack.isEmpty()) System.out.println("Error: missing right delimiter");
	}
}
// Stack structure
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
}
// Testing main()
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Brackets {
	public static void main(String[] args) throws IOException {
		
		String input;
		while(true) {
			System.out.println("Enter string to check for delimiters: ");
			System.out.flush();
			input = getString();
			if(input.equals("")) break;
			
			BracketChecker theChecker = new BracketChecker(input);
			theChecker.check();
		}
	}
	
	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
}
