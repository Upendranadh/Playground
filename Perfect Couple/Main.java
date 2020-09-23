import java.util.Scanner;
class Main
{
    public static void main(String args[]) 
    {
      Scanner in = new Scanner(System.in);
      int array_size = in.nextInt();
       int arr[] = new int[array_size];
       for(int index = 0; index <= array_size - 1; index++)
       {
           arr[index] = in.nextInt();
       }
         int search_sumelement=in.nextInt();
      pair_of_elements(array_size,search_sumelement,arr);
    }
   public static void pair_of_elements(int array_size,int search_sumelement,int arr[])
   {
     for(int index=0;index<=array_size-1;index++)
     {
       for(int i=index+1;i<=array_size-1;i++)
       {
         if(arr[index]+arr[i]==search_sumelement)
           System.out.println(arr[index]+ ", "+ arr[i]);
       }
       
     }
   }
}
