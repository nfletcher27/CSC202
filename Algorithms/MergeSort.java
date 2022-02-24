// Merge sort is similar to quicksort, as it is a divide and conquer algorithm
// We divide the array into two halves, and use recursive function to call itself again for each half until the process is done
// A merge method is used to merge two halves once they have been sorted
// So in summmary, it is quite simple, we split the array into pieces progressively, and put them back together in the proper order
import java.util.Arrays;

public class MergeSort {
	
public static void merge(int [] arr, int par, int q, int r) {
	int temp[] = new int [arr.length];
	int first1= par;
	int last1= q;
	int first2 = q+1;
	int last2 = r;
	int index = first1;
	
	while(first1 <= last1 && first2 <= last2) {
		if(arr[first1] < arr[first2]) {
			temp[index] = arr[first1];
			first1++;
	} else {
		temp[index] = arr[first2];
		first2++;
	}
		index++;
	}
	while(first1 <= last1) {
		temp[index++] = arr[first1++];
	}
	while(first2<=last2) {
		temp[index++] = arr[first2++];
	}
	for(index = par; index <= r; index++) {
		arr[index] = temp[index];
	
	}
}

public static void mergeSort(int[] arr, int p , int r) {

	if(p < r) {
		int mid = (p+r)/2;
		mergeSort(arr, p, mid);
		mergeSort(arr, mid+1, r);
		merge(arr, p ,mid,r);
	}
}


public static void main(String args[]) {

	int[] test = {8, 2, 4, 2, 7, 22, 33, 9, 2};
	mergeSort(test, 0, test.length-1);
	System.out.println(Arrays.toString(test));
		
	}
}
