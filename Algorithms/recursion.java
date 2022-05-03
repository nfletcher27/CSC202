package com.nfletcher;

public class Recursion {

     record Person(String names, String countries, int health) {

        public static final Person nextInLine = new Person("James", "USA", 100);

        public static String name;
         public static boolean country;
     }

    Person nextInLine = new Person("Alex", "Switzerland", 100);

    /*
    public Recursion(int someValue) {
        if(someValue == 1)
            return;
        return Recursion(someValue + 1);

    } */

    public static String reverseString(String input) {
        // If our string is empty we are done (base case)
        // To use recursion for reversal, add the first character to the end and make our next string 1 more inward
        if(input.equals(""))
            return "";

        return reverseString(input.substring(1)) + input.charAt(0);
    }
    
    public void printCharacterInfo(Person character) {
        System.out.println(Person.name);
        System.out.println(Person.country);
    }

    public static void stringReversalTesting() {
        System.out.println(reverseString("cat").equals("tac"));
        System.out.println(reverseString("abcdefg").equals("gfedcba"));
        System.out.println(reverseString("Nesta").equals("atseN"));
    }

    public static Boolean checkPalindrome(String word) {
        // Our base is 0 or 1, as a string length 0 or 1 will always be the reverse of itself
        // Prior to our base case, we check to see that each character on either side is the same (palindrome)
        // If it is, we continue to recursion --> do the same process for the next layer in (length-1)
        if(word.length() == 0 || word.length() == 1)
            return true;

        if(word.charAt(0) == word.charAt(word.length() - 1))
            return checkPalindrome(word.substring(1, word.length() - 1));

        return false;
    }

    public static String decimalToBinary(int decimal, String result) {
        // Take a number and divide it by 2, keeping track of remainder (either 0 or 1)
        // Combining these remainders will be our binary number
        if(decimal == 0)
            return result;

        result = decimal % 2 + result;
        return decimalToBinary(decimal/2, result);
    }

    public static int addAllNumbers(int number) {
        // If our number is 1 or less we just return it (last number)
        // Otherwise, return our prior number with the next in line -1 (traversing downward)
        if(number <= 1)
            return number;

        return number + addAllNumbers(number - 1);
    }

    public static int binarySearch(int[] list, int left, int right, int target) {
        // Not a valid logical situation for binary search, should be a sorted list
        if(left > right)
            return -1;

        // Set our middle value to our middle
        int mid = (left + right) / 2;

        // If our target is the middle, that's our answer
        if(target == list[mid])
            return mid;

        // If our target is less than our middle, we start again with new parameters (our leftmost to our middle)
        if(target < list[mid])
            return binarySearch(list, left, mid - 1, target);

        // Vice versa logic for above, new parameters of middle to rightmost
        return binarySearch(list, mid + 1, right, target);
    }

    public static long FibonacciSequenceNaive(long number) {
        if((number == 0) || (number == 1))
            return number;
        else
            return FibonacciSequenceNaive(number - 1) + FibonacciSequenceNaive(number - 2);
    }

    public static void mergeSort(int[] list, int start, int end) {
        if(start < end) {
            // Split our list into many lists until we reach a base case of 1 integer (cannot divide further)
            int mid = (start + end) / 2;
            mergeSort(list, start, mid);
            mergeSort(list, mid + 1, end);
            merge(list, start, mid, end);
        }
    }

    public static void merge(int[] list, int start, int mid, int end) {
        int[] temp = new int[end - start + 1]; // We want a temporary array to store our split arrays from mergeSort()

        int i = start;
        int j = mid + 1;
        int k = 0;

        // As long as our subarrays are not empty we should continue merging and comparing values
        while(i <= mid && j <= end) {
            if(list[i] <= list[j]) {
                temp[k] = list[i];
                i++;
                k++;
            } else {
                temp[k] = list[j];
                k++;
                j++;
            }
        }

        // Adding left subarray values
        while(i <= mid) {
            temp[k] = list[i];
            k++;
            i++;
        }

        // Adding right subarray values
        while(j <= end) {
            temp[k] = list[j];
            k++;
            j++;
        }

        for(i = start; i <= end; i++) {
            list[i] = temp[i - start];
        }
    }
    

    public static void main(String[] args) {
        stringReversalTesting();
        System.out.println(decimalToBinary(2002, ""));
        System.out.println(decimalToBinary(2002, "").equals("11111010010"));
        FibonacciSequenceNaive(12);
        int[] mergeTesting = {3, 22, 6, 3, 999, 232, 11, 1, 232, 222};
        mergeSort(mergeTesting, 0, mergeTesting.length - 1);
    }
}
