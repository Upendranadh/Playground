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

      for(int i=0;i<str_length1;i++)
      {
        if(str1.charAt(i)>='a' && str1.charAt(i)<='z' )
        {
           int offset = str1.charAt(i)-'a';
           char ch=(char)(offset+'a');
           if(arr[offset]>0)
           {
           System.out.print(ch);
           System.out.print(arr[offset]+" ");
           }
           arr[offset]=0;
        }
        else if(str1.charAt(i)>='A' && str1.charAt(i)<='Z' )
        {
           int offset = str1.charAt(i)-'A';
           char ch=(char)(offset+'a');
           if(arr[offset]>0)
           {
           System.out.print(ch);
           System.out.print(arr[offset]+" ");
           }
           arr[offset]=0;
        }

        }
      }
    }
