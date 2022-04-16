public class Kata
{
    public static int[] countPositivesSumNegatives(int[] input)
    {
      int[] output = new int[2];
      int[] nullO = new int[0];
      if(input == null) return nullO;
      if(input.length < 1) return input;
      int negatives = 0;
      int posCount = 0;
      for(int i = 0; i < input.length; i++) {
        if(input[i] > 0) posCount++;
        if(input[i] < 0) negatives += input[i];
      }
      output[0] = posCount;
      output[1] = negatives;
      return output;
    }
}
