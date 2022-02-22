// Searches for an item within a sorted list by first checking whether it is larger or smaller than one half of the list, and cutting the list in half based on that fact
public int find(long searchKey) {
    int lowerBound = 0;
    int upperBound = nElems-1; // our upperbound is one less than the # of elements since indexes work off 0
    int curIn; // variable for our current
    
    while(true) {
      curIn = (lowerBound + upperBound)/2; // halfway point
      if(a[curIn] == searchKey) // simple check to see if our answer happens to be exactly in the middle
        return curIn;
      else if(lowerBound > upperBound) // error check, if our upperbound is somehow smaller than our lowerbound this does not make sense
        return nElems;
      else {
        if(a[curIn] < searchKey) 
          lowerBound = curIn + 1;
        else
          upperBound = curIn - 1;
      }
    }
  }
