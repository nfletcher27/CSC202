// This uses an intersection method to find what values of two arrays intersect and adds/returns them to a list.
// The original intersection method (intersection) is a slower time complexity, whereas intersectionFast is O(n log n).
// We use Arrays.sort to sort our arrays first so we can traverse them in an ascending manner, if one of the items matches each other, add it to the list
// This is time complexity problem that takes a prompt of finding intersecting values and finding a faster time complexity 
// Our pointers are the ac and bc values which we use in our for loops for ascent each of the loops checking for matching values given in the for loops
// We will check each value in each array individually until we can find our matches that we need 
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class SimpleIntersection {

    private BinarySearch search = new BinarySearch();

    public List<Integer> intersection(int[] a, int[] b) {
        List<Integer> result = new LinkedList<>();
        for (int x : a) {
            for (int y : b) {
                if (x == y) result.add(x);
            }
        }
        return result;
    }

    public List<Integer> intersectionFast(int[] a, int[] b) {
        mergeSort(a);
        mergeSort(b);
        List<Integer> intersect = new ArrayList<Integer>();
        int ac = 0;
        int bc = 0;
        while(ac < b.length && ac < a.length) {
            if(a[ac] < b[bc]) {
                ac++;
            }
            else if(a[ac] > b[bc]) {
                bc++;
            }
            else {
                intersect.add(a[ac]);
                ac++;
                bc++;
            }
        }
        return intersect;
    }

    public void mergeSort(int[] input) {
        Arrays.sort(input);
    }

    public static void main(String[] args) {
        SimpleIntersection inter = new SimpleIntersection();
        System.out.println(inter.intersectionFast(new int[]{4, 7, 5, 2, 3}, new int[]{4, 2, 3, 9, 1}));
        System.out.println(inter.intersectionFast(new int[]{4, 6, 11, 2, 3}, new int[]{5, 11, 3, 9, 1}));
    }
}
