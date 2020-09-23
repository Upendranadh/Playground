import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	   Scanner in= new Scanner(System.in);
       int n1=in.nextInt();
       int n2=in.nextInt();
       int n3=in.nextInt();
       int gretestnumber=largest_numbersof_twonumbers(n1,n2);
        System.out.println(largest_numbersof_twonumbers(gretestnumber,n3));
      
  	}
  public static int largest_numbersof_twonumbers(int n1,int n2)
    {
    int gretestnumber=0;
	  if(n1>n2)
      {
        gretestnumber=n1;
      }
      else
      {
         gretestnumber=n2;
       
      }
     return gretestnumber ;
   	}
 
 }

