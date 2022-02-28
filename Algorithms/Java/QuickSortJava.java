// Quicksort algorithm
// We use a pivot, and move items less than to the left and greater than to the right
// This uses partitions just like Merge sort
// Use a pivot of the rightmost item, and compare our furthest left to furthest right, do this moving in once on each side
// Each time we do this we are swapping if one is greater than the other (left = smaller), until lower and upper indexes meet
// Now we swap our lower index with pivot, and call quicksort (recursive sorting algo) on each side which are now partitions (just like mergesort)
// Recursive, divide and conquer, very efficient for large data sets
