// bunnyEars
public int bunnyEars(int bunnies) {
  return bunnies + bunnies;
}

// fibonacci
public int fibonacci(int n) {
  if(n <= 1) return n; // base case for 0 and 1
  return fibonacci(n-1) + fibonacci(n-2); // takes the two prior numbers of n to add (which is how fibo works), and does that same function until it reaches 1
}

// factorial
public int factorial(int n) {
  if(n <= 2) return n;
  return n * factorial(n-1);
}
