import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int rev=0;
      int sum=0;
      int f=1;
      int temp=n;
      while(n>0)
      {
        int last_digit=n%10;
       
        n=n/10;
        for(int i=1;i<=last_digit;i++)
        {
          
          f=f*i;
          
          
        }
       
        sum=sum+f;
        f=1;
        
      }
      
      if(temp==sum)
        System.out.println("Yes");
      else
        System.out.println("No");
        
      
	}
}