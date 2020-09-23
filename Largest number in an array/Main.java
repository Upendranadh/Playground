import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in =new Scanner(System.in);
		int array_size =in.nextInt();
		int arr[]=new int[array_size];
		for(int index=0;index<array_size;index++)
		{
		    arr[index]=in.nextInt();
		    
		}
	
		int highest_number=0;
        for(int index=1;index<=array_size;index++)
		{
		   if(arr[index-1]<highest_number)
		   {
		        highest_number=highest_number;
		   }
		   else
		   {
		       highest_number=arr[index-1];
		   }
		}
	
	System.out.println(highest_number);
	}
}
