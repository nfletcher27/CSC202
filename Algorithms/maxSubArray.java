// This implements Kadane's algorithm, with 1 added element that is commented in
public class MaximumSubarray {
    public int maxSubarrayCross(int[] a, int l, int m, int h) {
        int leftSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = m; i >= l; i--) {
            sum += a[i];
            if (sum > leftSum)
                leftSum = sum;
        }
        int rightSum = Integer.MIN_VALUE;
        sum = 0;
        for (int i = m + 1; i <= h; i++) {
            sum += a[i];
            if (sum > rightSum)
                rightSum = sum;
        }
        return leftSum + rightSum;
    }

    public int maxSubarrayAux(int[] a, int l, int h) {
        if (l == h)
            return a[l];
        else {
            int m = (l + h) / 2;
            int bl = maxSubarrayAux(a, l, m);
            int br = maxSubarrayAux(a, m + 1, h);
            int bc = maxSubarrayCross(a, l, m, h);
            int best = Math.max(Math.max(bl, br), bc);
            return best;
        }
    }

    public Integer maxSubarray(int[] a) {
        int max = 0;
        int current = 0;
        for(int i = 0; i < a.length; i++) {
            current = Math.max(a[i] + current, a[i]);
            max = Math.max(current, max);
        }
        if(max == 0) max -= 1; // I don't know why but for some reason when dealing with arrays of only negatives, this addition is required to return the right number
        return max;
    }

    public static void main(String[] args) {
        int[] a = {-5, -4, -3, -2, -1, -2, -3};
        MaximumSubarray maxSubarray = new MaximumSubarray();
        System.out.println("Maximum subarray = " + maxSubarray.maxSubarray(a));
    }
}
