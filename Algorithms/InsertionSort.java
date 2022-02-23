// We have two sections, sorted and unsorted
// Each iteration we continue to go through the unsorted portion checking whether it needs to be rearranged or not
// If it does, we swap the two items and shift everything up once to make room for the new item added into the sorted section
public void insertionSort(int arr[]) {
	int n = arr.length;
	
	for(int i = 0; i < n; ++i) {
		int key = arr[i];
		int j = i - 1;
		
		while(j >= 0 && arr[j] > key) {
			arr[j+1] = arr[j];
			j = j - 1;
		}
		arr[j+1] = key;
	}
}
