// This is a program which has an interactive interface permitting certain actions to be allowed for controlling our iterator
// Our actions are:
/* s - show contents
r - reset to beginning of list
n - go to next link
g - get contents of current link
b - insert before current link
a - insert new link after current link
d - delete current link */

// Firstly is our link class
import java.io.*;      // for I/O
public class Link {

   public long dData;             // data item
   public Link next;              // next link in list

   public Link(long dd)           // constructor
      { dData = dd; }

   public void displayLink()      // display ourself
      { System.out.print(dData + " "); }
}
   
// Next up is our linked list class using our link class to create linked lists
public class LinkList {

   private Link first;            // ref to first item on list

   public LinkList()              // constructor
      { first = null; }           // no items on list yet

   public Link getFirst()         // get value of first
      { return first; }

   public void setFirst(Link f)   // set first to new link
      { first = f; }

   public boolean isEmpty()       // true if list is empty
      { return first==null; }

   public ListIterator getIterator()  // return iterator
      {
      return new ListIterator(this);  // initialized with
      }                               //    this list

   public void displayList() {
      Link current = first;       // start at beginning of list

      while(current != null)      // until end of list,
         {
         current.displayLink();   // print data
         current = current.next;  // move to next link
         }
      System.out.println("");
      }
}

// And finally is our list iterator which is fairly complex and long at first, but is really just a few methods
public class ListIterator {
   private Link current;          // current link
   private Link previous;         // previous link
   private LinkList ourList;      // our linked list

   public ListIterator(LinkList list) // constructor
      {
      ourList = list;
      reset();
      }

   public void reset()            // start at 'first'
      {
      current = ourList.getFirst();
      previous = null;
      }

   public boolean atEnd()         // true if last link
      { return (current.next==null); }

   public void nextLink()         // go to next link
      {
      previous = current;
      current = current.next;
      }

   public Link getCurrent()       // get current link
      { return current; }

   public void insertAfter(long dd)     // insert after
      {                                 // current link
      Link newLink = new Link(dd);

      if( ourList.isEmpty() )     // empty list
         {
         ourList.setFirst(newLink);
         current = newLink;
         }
      else                        // not empty
         {
         newLink.next = current.next;
         current.next = newLink;
         nextLink();              // point to new link
         }
      }

   public void insertBefore(long dd)    // insert before
      {                                 // current link
      Link newLink = new Link(dd);

      if(previous == null)        // beginning of list
         {                        // (or empty list)
         newLink.next = ourList.getFirst();
         ourList.setFirst(newLink);
         reset();
         }
      else                        // not beginning
         {
         newLink.next = previous.next;
         previous.next = newLink;
         current = newLink;
         }
      }

   public long deleteCurrent()    // delete item at current
      {
      long value = current.dData;

      if(previous == null)        // beginning of list
         {
         ourList.setFirst(current.next);
         reset();
         }
      else                        // not beginning
         {
         previous.next = current.next;
         if( atEnd() )
            reset();
         else
            current = current.next;
         }
      return value;
      }
}
