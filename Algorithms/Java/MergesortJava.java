// Break lists into smaller lists (partitioning), and compare within our list
// Example: two partitions 2, 4, 1, 3
// Split into 2 4 and 1 3 --> compare 2 and 4 --> compare 1 and 3
// Put smallest ones back into original
// Another example: 17 87 6 22 41 3 13 54 -- > 17 87 | 6 22 | 41 3 | 13 54 | -- > all items in individual lists, now all 'lists' are sorted
// Merge back together --> 4 lists with two items each | 17 or 87 --> 17 87 and continue until we get 17 87 6 22 3 41 13 54
// Merge groups of two -> 6 17 22 87 and 3 13 41 54 --> merge these final two into our final sorted list
public void MergeSort(int[] list, int lowIndex, int highIndex) {
  if(lowIndex == highIndex) return;
  else {
    int midIndex = (lowIndex + highIndex)/2;
    mergeSort(list, lowIndex, midIndex);
    mergeSort(list, midIndex+1, highIndex);
    merge(list, lowIndex, midIndex+1, highIndex);
  }
}
// Divide and conquer algo, recursive, O(n log n)
// Here is the method for merging our partitions back
public void merge(int arr[], int l, int m, int r) {
  
  int n1 = m - l + 1;
  int n2 = r - m;
  
  int L[] = new int[n1];
  int R[] = new int[n2];
  
  for(int i = 0; i < n1; ++i)
    L[i] = arr[l + i];
  for(int j = 0; j < n2; ++j)
    R[j] = arr[m + 1 + j];
  
  int i = 0;
  int j = 0;
  int k = l;
  while(i < n1 && j < n2) {
    if(L[i] <= R[j]) {
      arr[k] = L[i];
      i++;
    } else {
      arr[k] = R[j];
      j++;
    }
    k++;
  }
  
  while(i < n1) {
    arr[k] = L[i];
    i++;
    k++;
  }
  
  while(j < n2) {
    arr[k] = R[j];
    j++;
    k++;
  }
}
