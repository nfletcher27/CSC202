import java.io.*;

public class Params {
  
  public int n;
  public int returnAddress;
  
  public Params(int nn, int ra) {
    n = nn;
    returnAddress = ra;
  }
}

public class Stack {
  
  private int maxSize;
  private Params[] stackArray;
  private int top;
  
  public StackX(int s) {
    maxSize = s;
    stackArray = new Params[maxSize];
    top = -1;
  }
  
  public void push(Params p) {
    stackArray[++top] = p;
  }
  
  public Params pop() {
    return stackArray[top--];
  }
  
  public Params peek() {
    return stackArray[top];
  }
}

public class Triangle {
  
  static int theNumber;
  static int theAnswer;
  static Stack theStack;
  static int codePart;
  static Params theseParams;
  
  public static void main(String[] args) {
    
    System.out.println("Enter a number: ");
    theNumber = getInt();
    recTriangle();
  }
  
  public static void recTriangle() {
    
    theStack = new StackX(10000);
    codePart = 1;
    
    while(step() == false)
      ;
  }
  
  public static boolean step() {
    switch(codePart) {
      case 1:
        theseParams = new Params(theNumber, 6);
        theStack.push(theseParams);
        codePart = 2;
        break;
      case 2:
        theseParams = theStack.peek();
        if(theseParams.n == 1) {
          theAnswer = 1;
          codePart = 5;
        } 
        else 
          codePart = 3;
        break;
      // and so on
    }
    return false;
  }
  
        
         
        
      
    
