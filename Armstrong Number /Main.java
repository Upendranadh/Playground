import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int n= in.nextInt();
      int c=0;
      int a=0;
      int temp=n;
      while(n>0)
      {
        c=n%10;
        a=a+(c*c*c);
        n=n/10;
         }
      if(a==temp)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
      
	}
}