import java.util.Scanner;
public class Main
{
	public static void main (String[] args)
	{
	    Scanner in= new Scanner(System.in);
        int input1=in.nextInt();
        int input2=in.nextInt();
        int input3=in.nextInt();
        int smallestnumber=smallest_numbersof_threenumbers(input1,input2,input3);
        GCD(input1,input2,input3,smallestnumber);
    }
  public static void GCD(int n1,int n2,int n3,int smallestnumber)
  {
    int gcdnumber=1;
    if(n1%smallestnumber==0 && n2%smallestnumber==0 && n2%smallestnumber==0)
    {
      gcdnumber=smallestnumber;
      System.out.println(gcdnumber);
    }
    else
    {
    for(int i=1;i<=smallestnumber/2;i++)
    {
      if(n1%i==0 && n2%i==0 && n3%i==0)
      {
        gcdnumber=i*gcdnumber;
      }
  }
      System.out.println(gcdnumber);
    }
}
  public static int smallest_numbersof_threenumbers(int n1,int n2,int n3)
    {
    int smallestnumber=0;
	  if(n1>n2)
      {
        smallestnumber=n2;
      }
      else
      {
         smallestnumber=n1;
       
      }
    if(smallestnumber>n3)
    {
      smallestnumber=n3;
    }
    else
    {
      smallestnumber=smallestnumber;
    }
    return smallestnumber ;
   	}
}