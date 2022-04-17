import java.util.ArrayList;

public class CountingDuplicates {
  public static int duplicateCount(String text) {
    
    ArrayList<Character> allSeen = new ArrayList<Character>();
    ArrayList<Character> dupesSeen = new ArrayList<Character>();
    int dupesCount = 0;
    
    for(int i = 0; i < text.length(); i++) {
      if(allSeen.contains(Character.toLowerCase(text.charAt(i))) && !dupesSeen.contains(Character.toLowerCase(text.charAt(i)))) {
        dupesCount++;
        dupesSeen.add(Character.toLowerCase(text.charAt(i)));
      }
      allSeen.add(Character.toLowerCase(text.charAt(i)));
    }
    return dupesCount;
  }
}
