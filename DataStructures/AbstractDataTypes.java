// Here we can see the abstraction of our implemented data structure used to do something such as create a stack
// For this stack, instead of using an array, we will use a linked list
// Link class where we create our link objects and the methods for them
public class Link {

   public long dData;             // data item
   public Link next;              // next link in list

   public Link(long dd)           // constructor
      { dData = dd; }

   public void displayLink()      // display ourself
      { System.out.print(dData + " "); }
   }  // end class Link


// Our linked list constructor and our methods for manipulating our linked lists
public class LinkList {

   private Link first;            // ref to first item on list

   public LinkList()              // constructor
      { first = null; }           // no items on list yet

   public boolean isEmpty()       // true if list is empty
      { return (first==null); }

   public void insertFirst(long dd) // insert at start of list
      {                           // make new link
      Link newLink = new Link(dd);
      newLink.next = first;       // newLink --> old first
      first = newLink;            // first --> newLink
      }

   public long deleteFirst()      // delete first item
      {                           // (assumes list not empty)
      Link temp = first;          // save reference to link
      first = first.next;         // delete it: first-->old next
      return temp.dData;          // return deleted link
      }

   public void displayList() {
      Link current = first;       // start at beginning of list

      while(current != null)      // until end of list,
         {
         current.displayLink();   // print data
         current = current.next;  // move to next link
      }
      System.out.println("");
      }
   }  // end class LinkList


// Our class for our Stack using a linked list as its implementation
// Notice that to create our stack we are using a linked list object of our own construction instead of a Java array
public class LinkStack {
   private LinkList theList;

   public LinkStack()             // constructor
      {
      theList = new LinkList();
      }

   public void push(long j)     // put item on top of stack
      {
      theList.insertFirst(j);
      }

   public long pop()            // take item from top of stack
      {
      return theList.deleteFirst();
      }

   public boolean isEmpty()       // true if stack is empty
      {
      return ( theList.isEmpty() );
      }

   public void displayStack()
      {
      System.out.print("Stack (top-->bottom): ");
      theList.displayList();
      }
   }
}

// These levels of abstraction make it easier for us to do more complex things as we continuously design larger programs
