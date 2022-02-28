// Quicksort algorithm
// We use a pivot, and move items less than to the left and greater than to the right
// This uses partitions just like Merge sort
// Use a pivot of the middle or RANDOM (random is often n log n), and compare our furthest left to furthest right, do this moving in once on each side
// Each time we do this we are swapping if one is greater than the other (left = smaller), until lower and upper indexes meet
// Now we swap our lower index with pivot, and call quicksort (recursive sorting algo) on each side which are now partitions (just like mergesort)
// Recursive, divide and conquer, very efficient for large data sets
// Worst case O(n^2) average case O(n log n)
import java.util.Arrays;
import java.util.Random;

public class QuickSort {
  public void quickSort(int[] A) {
    quickSort(A, 0, A.length-1);
  }
  
  public void quickSort(int[] A, int low, int high) {
    if(low < high+1) {
      int p = partition(A, low, high);
      quickSort(A, low, p-1);
      quickSort(A, p+1, high);
    }
  }
  
  private void swap(int[] A, int index1, int index2) {
    int temp = A[index1];
    A[index1] = A[index2];
    A[index2] = temp;
  }
  
  private int getPivot(int low, int high) {
    Random rand = new Random();
    return rand.nextInt((high-low) + 1) + low;
  }
  
  private int partition(int[] A, int low, int high) {
    swap(A, low, getPivot(low, high));
    int border = low + 1;
    for(int i = border; i <= high; i++) {
      if(A[i] < A[low]) {
        swap(A, i, border++);
      }
    }
    swap(A, low, border-1);
    return border-1;
  }
  
  
