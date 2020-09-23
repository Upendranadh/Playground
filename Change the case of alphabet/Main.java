import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
     char ch = in.next().charAt(0);
      if(ch >= 'a' && ch <= 'z')
      {
        int offset = ch - 'a';
        ch = (char) ('A' + offset);
        System.out.print(ch);
      }
      else if(ch >= 'A' && ch <= 'Z')
      {
        int offset = ch - 'A';
        ch = (char) ('a' + offset);
         System.out.print(ch);
      }
  }
}