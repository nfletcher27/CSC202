public class Solution
{
    public static int[] twoSum(int[] numbers, int target)
    {
      int[] pos = new int[2];
      for(int i = 0; i < numbers.length; i++) {
        for(int j = 0; j < numbers.length; j++) {
          if(numbers[i] + numbers[j] == target && i != j) return new int[] {i, j};
        }
      }
      return new int[] {};
    }
}
