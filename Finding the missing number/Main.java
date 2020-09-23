import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       int arr_size = sc.nextInt();
       int arr[] = new int[arr_size];
       int temparr[]=new int[arr_size];
       int missing_element=0;
      int last_element=arr_size;
      for(int i=0;i<=arr_size-1;i++)
      {
        arr[i]=sc.nextInt();
        temparr[i]=i+1;
      }
      for(int i=0;i<=arr_size-1;i++)
      {
        last_element=arr_size;
        while(last_element>=0)
        {
          if(arr[i]==last_element)
          {
            temparr[last_element-1]+=1;
            break;
          }
          else
          {
            last_element--;
          }
          
        }
      }
        for(int i=0;i<=arr_size-1;i++)
        {
          int k=i+1;
          if( temparr[i]-k==0)
          {
            System.out.println(i+1);
          }
         }
    }
}