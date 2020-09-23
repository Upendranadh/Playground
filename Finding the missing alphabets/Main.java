import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
       String str1=in.nextLine();
       int str_length1=str1.length();
       int arr[]=new int[26];
       for(int i=0;i<=25;i++)
       {
           arr[i]=0;
       }
      for(int index=0;index<str_length1;index++)
      {
        if(str1.charAt(index)>='a' && str1.charAt(index)<='z')
        {
           int offset = str1.charAt(index)-'a';
           arr[offset]++;
        }
        else if(str1.charAt(index)>='A' && str1.charAt(index)<='Z')
        {
          int offset = str1.charAt(index)-'A';
           arr[offset]++;
        }
      }

      for(int i=0;i<=25;i++)
      {
        if(arr[i]==0)
        {
          char ch=(char)('a' + i);
          System.out.print(ch +" ");
        }
      }
    

        
      }
    }
