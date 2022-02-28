// Repeatedly compares for item on right is larger
// We can check if sorting is completed by seeing if any swaps occurred, if there wasn't then it's done
// This is O(n^2) time complexity as it uses nested loops
public int[] bubbleSort(int[] list) {
  int i, j, temp = 0;
  
  for(i = 0; i < list.length-1; i++) {
    for(j = 0; j < list.length-1-i; j++) {
      if(list[j] > list[j+1]) {
        temp = list[j];
        list[j] = list[j+1];
        list[j+1] = temp;
      }
    }
  }
  return list;
}
