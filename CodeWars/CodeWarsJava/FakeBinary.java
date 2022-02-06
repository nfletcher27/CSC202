// Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. Return the resulting string.
import java.util.ArrayList;

public class FakeBinary {
    public static String fakeBin(String numberString) {
      
      ArrayList<Character> numbers = new ArrayList<Character>();
      
      for(int i = 0; i < numberString.length(); i++) {
        numbers.add(numberString.charAt(i));
      }
      
      for(int i = 0; i < numbers.size(); i++) {
        if(Character.getNumericValue(numbers.get(i)) > 4) {
          numbers.set(i, '1');
        } else {
          numbers.set(i, '0');
        }
      }
      
      String complete = "";
      for(int i = 0; i < numbers.size(); i++) {
        complete += numbers.get(i).toString();
      }
      
        return complete;
    }
}
