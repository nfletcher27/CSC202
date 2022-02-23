// Selection sort works by picking the minimum, and sliding it to the left, and checking each unchecked index to see whether it is less than the rest
// Each iteration of the selection sort is one less than before because each iteration ensures one more piece has been properly sorted
public void selectionSort(int arr[]) {
	int n = arr.length;
		
	for(int i = 0; i < n-1; i++) { // moving our boundary one at a time
		int min_idx = i; // use this value to check it against all other values
		for(int j = i+1; j <n; j++) 
			if(arr[j] < arr[min_idx])
				min_idx = j;
				
		int temp = arr[min_idx]; // this will execute regardless, but the code above is what makes it relevant. It checks to see if another index is smaller
		arr[min_idx] = arr[i];
		arr[i] = temp;
	}	
}

// Testing
import java.util.Arrays;

public class SelectionSort {
    
    public static void main(String[] args) {
    
        int[] test = {9, 8, 7, 6, 5, 4, 3};
        sort(test);
        System.out.println(Arrays.toString(test));

    }
    public static void sort(int[] nums) {
        int len = nums.length;
        for(int i = 0; i < len-1; i++) {
            int min = i;
            for(int j = i+1; j < len; j++)
                if(nums[j] < nums[min])
                min = j;
            
            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }
    }
}
