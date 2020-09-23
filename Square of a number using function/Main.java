import java.util.Scanner;
class Main
{
  public static int square_function(int num)
  {
     num=num*num;
    return num;
  }
  
	public static void main (String[] args)
    {
	   Scanner in = new Scanner(System.in);
       int n =in.nextInt();
       int square = square_function(n);
        System.out.println(square);
      
	} 
}