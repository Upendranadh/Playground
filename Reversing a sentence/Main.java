import java.util.Scanner;
public class Main
{
 public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
          String str=in.nextLine();
          String [] arr=str.split(" ");
          String s2="";
          for(int i=arr.length-1;i>=0;i--)
          {
           s2=s2+arr[i]+" ";   
          }
          System.out.println(s2);
          
 }
}