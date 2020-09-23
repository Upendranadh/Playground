import java.util.Scanner;
public class Main
{
 public static void main(String[] args) 
 {
       Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        int start=0;
        int str_length = str.length();
        int end = str_length-1;
   int palindrome=0;
   for(int index=0;index<(str_length/2);index++)
   {
   
     if(str.charAt(start)==str.charAt(end))
     {
       palindrome=1;
     }
     else
     {
       palindrome=0;
     }
   }
   if(palindrome==1)
   {
     System.out.println("Yes");
   }
   else
   {
       System.out.println("No");
   }
 }
}
          
          