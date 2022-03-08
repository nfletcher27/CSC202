public static void towers(int top, char from, char inter, char to) {
  
  if(top == 1) {
    System.out.println("Disk 1 from" + from + " to " + to);
  } else {
    towers(top-1, from, to, inter);
    System.out.println("Disk " + top + " from " + from + " to " + to);
    towers(top-1, inter, from, to);
  }
}
