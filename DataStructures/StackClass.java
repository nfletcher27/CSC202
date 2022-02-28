// Subclass of a vector, utilizes the concept of push and pop operations and last-in-first-out principle
// Stack extends vector, which implemets list which extends collection which extends iterable

public class Stack<E> extends Vector<E>

Stack<E> stack = new Stack<E>();
// Example
class Test {
  
  static void stack_push(Stack<Integer> stack) {
    for(int i = 0; i < 5; i++) {
      stack.push(i);
    }
  }
  
  static void stack_pop(Stack<Integer> stack) {
    Sysout"Pop!"
    for(int i = 0; i < 5; i++) {
      Integer y = (Integer) stack.pop();
      System.out.println(y);
    }
  }
}

// methods
empty(); // returns true if nothing is on top of stack
peek(); // returns element at top of stack, doesn't remove
pop(); // removes and returns top element of stack
push(Object element); // pushes element to top of stack
search(Object element); // determines whether and object exists in the stack
// methods inherited from Vector
add(), addAll(Collection), capacity(), clear(), clone(), contains(), get(), equals(), indexOf(), isEmpty(), remove(), size(), toArray(), etc.
  
// ArrayDeque is the suggested Java implementation of a stack
import java.util*;

class Example {
  public static void main(String[] args) {
    Deque<Character> stack = new ArrayDeque<Character>();
    stack.push('A');
    stack.push('B');
    System.out.println(stack.peek());
  }
}

