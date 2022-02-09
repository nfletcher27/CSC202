// Method to convert a String of binary to decimal (base to base 10)
public int convertToDecimal(String binary) {
  int conversion = 1;
  int result = 0;
  for(int i = 1; i <= binary.length(); i++) {
    if(binary.charAt(binary.length-1) == '1')
      result += conversion;
    conversion *= 2;
  }
  return result;
}
