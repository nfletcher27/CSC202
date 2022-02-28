// This program uses the following rules, and the stack data structure - to translate an infix (tradional arithmetic expression) to postfix
// Here is an example: A*(B+C)-D/(E+F) in postfix would be --> ABC+*DEF+/-
// The rules for creating these algorithms: for an operand, write it to output | open parantheses, push it on stack | close paranthesis
// When all is said and done, pop items and output
public class StackX {

   private int maxSize;
   private char[] stackArray;
   private int top;

   public StackX(int s) {
      maxSize = s;
      stackArray = new char[maxSize];
      top = -1;
      }

   public void push(char j) { stackArray[++top] = j; }

   public char pop() { return stackArray[top--]; }

   public char peek()        // peek at top of stack
      { return stackArray[top]; }

   public boolean isEmpty()  // true if stack is empty
      { return (top == -1); }

   public int size()         // return size
      { return top+1; }

   public char peekN(int n)  // return item at index n
      { return stackArray[n]; }

   public void displayStack(String s) {

      System.out.print(s);
      System.out.print("Stack (bottom-->top): ");

      for(int j=0; j<size(); j++)
         {
         System.out.print( peekN(j) );
         System.out.print(' ');
         }
      System.out.println("");

      }
   }  

// Class for translating infix to postfix
public class InToPost {

   private StackX theStack;
   private String input;
   private String output = "";

   public InToPost(String in) {
      input = in;
      int stackSize = input.length();
      theStack = new StackX(stackSize);
      }

   public String doTrans() {
      for(int j=0; j<input.length(); j++) {
         char ch = input.charAt(j);
         theStack.displayStack("For "+ch+" "); // *diagnostic*
         switch(ch)
            {
            case '+':               // it's + or -
            case '-':
               gotOper(ch, 1);      // go pop operators
               break;               //   (precedence 1)
            case '*':               // it's * or /
            case '/':
               gotOper(ch, 2);      // go pop operators
               break;               //   (precedence 2)
            case '(':               // it's a left paren
               theStack.push(ch);   // push it
               break;
            case ')':               // it's a right paren
               gotParen(ch);        // go pop operators
               break;
            default:                // must be an operand
               output = output + ch; // write it to output
               break;
            }  // end switch
         }  // end for
      while( !theStack.isEmpty() )     // pop remaining opers
         {
         theStack.displayStack("While ");  // *diagnostic*
         output = output + theStack.pop(); // write to output
         }
      theStack.displayStack("End   ");     // *diagnostic*
      return output;                   // return postfix
      }  
  

   public  void gotOper(char opThis, int prec1)
      {                                // got operator from input
      while( !theStack.isEmpty() )
         {
         char opTop = theStack.pop();
         if( opTop == '(' )            // if it's a '('
            {
            theStack.push(opTop);      // restore '('
            break;
            }
         else                          // it's an operator
            {
            int prec2;                 
            if(opTop=='+' || opTop=='-') // find new op prec
               prec2 = 1;
            else
               prec2 = 2;
            if(prec2 < prec1)          // if prec of new op less
               {                       //    than prec of old
               theStack.push(opTop);   // save newly-popped op
               break;
               }
            else                       // prec of new not less
               output = output + opTop;  // than prec of old
            }  // end else (it's an operator)
         }  // end while
      theStack.push(opThis);        // push new operator
      }  // end gotOp()
  

   public  void gotParen(char ch) {                             // got right paren from input

      while( !theStack.isEmpty() )
         {
         char chx = theStack.pop();

         if( chx == '(' )           // if popped '('
            break;                  // we're done
         else                       // if popped operator
            output = output + chx;  // output it

         }  // end while
      }  // end popOps()
   }  // end class InToPost

// Program for testing
public class InfixApp {
   public static void main(String[] args) throws IOException {
      String input, output;

      while(true)
         {
         System.out.print("Enter infix: ");
         System.out.flush();
         input = getString();         // read a string from kbd
         if( input.equals("") )       // quit if [Enter]
            break;          
         InToPost theTrans = new InToPost(input);
         output = theTrans.doTrans(); // do the translation
         System.out.println("Postfix is " + output + '\n');
         }  // end while
      }  // end main()


   public static String getString() throws IOException
      {
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      String s = br.readLine();
      return s;
      }
   }  // end class InfixApp
