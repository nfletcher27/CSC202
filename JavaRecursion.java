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

// triangle
public int triangle(int rows) {
  if(rows <= 1) return rows; // base case, 0 and 1 will return themselves
  return rows + triangle(rows-1); // the triangle formula is simply itself + the sum of all rows prior, by calling the same method of n-1 we do this logic recursively
}
