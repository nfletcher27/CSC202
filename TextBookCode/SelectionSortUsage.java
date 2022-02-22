// Methods for dealing with array and selection sort algorithm
public class ArraySel {
	
	private long[] a;
	private int nElems;
	
	public ArraySel(int max) {
		a = new long[max];
		nElems = 0;
	}
	
	public void insert(long value) {
		a[nElems] = value;
		nElems++;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++)
			System.out.print(a[i] + " ");
		System.out.println("");
	}
	
	public void selectionSort() {
		int out, in, min;
		
		for(out = 0; out < nElems-1; out++) {
			min = out;
			for(in = out+1; in < nElems; in++)
				if(a[in] < a[min])
					min = in;
			
			swap(out, min);
		}
	}
	
	private void swap(int one, int two) {
		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
}

// main() for checking if execution worked
public class SelectSort {
	public static void main(String[] args ) {
		int maxSize = 100;
		ArraySel arr;
		arr = new ArraySel(maxSize);
		
		arr.insert(77);              
	    arr.insert(99);
	    arr.insert(44);
	    arr.insert(55);
	    arr.insert(22);
	    arr.insert(88);
	    arr.insert(11);
	    arr.insert(00);
	    arr.insert(66);
	    arr.insert(33);

	    arr.display();
	    
	    arr.selectionSort();
	    
	    arr.display();
	}
}

// if all went well 77 99 44 55 22 88 11 00 66 33 should now be 00 11 22 33 44 55 66 77 88 99
