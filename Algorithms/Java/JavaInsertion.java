// Insertion sort in Java
// Average time complexity O(n^2)
public int[] insertionSort(int[] list) {
  int i, j, key, temp;
  
  for(i = 1; i < list.size(); i++) {
    key = list[i];
    j = i - 1;
    while(j >= 0 && key < list[j]) {
      temp = list[j];
      list[j] = list[j+1];
      list[j+1] = temp;
      j--;
    }
  }
  return list;
}
