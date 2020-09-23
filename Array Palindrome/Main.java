import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
       int arr_size = sc.nextInt();
       int arr[] = new int[arr_size];
        int lastelement=arr_size-1;
         int is_palindrome=0;
       for(int index = 0; index < arr_size; index++)
       {
           arr[index] = sc.nextInt();
       }
      for(int index=0;index<=arr_size/2;index++)
      {
         if(arr[index]!=arr[lastelement])
            {
              is_palindrome=0;
              lastelement=lastelement-1;
              break;
            }
            else
            {
               is_palindrome=1;
               lastelement=lastelement-1;
            }
         } 
     
           if(is_palindrome==1)
            {
              System.out.println("Yes");
            }
            else
            {
               System.out.println("No");
              
            }
    }
}