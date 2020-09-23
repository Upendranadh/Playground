import java.util.*;
class Main
{
  public static void main(String args[])
  {
	char ch,encipher;
    int key;
    Scanner in = new Scanner(System.in);
     ch = in.next().charAt(0);
     key = in.nextInt();
  
	if(Character.isLowerCase(ch))
    {
       	encipher=(char)  (((ch-'a')+key)%26);
       	
        System.out.print((char)(encipher+'a'));
    }
  	else
    {
       	encipher=  (char) (((ch-'A')+key)%26);
       	
       	System.out.print((char)(encipher+'A'));
    }
  }
}