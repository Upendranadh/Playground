import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
       Scanner in=new Scanner(System.in);
       int arr_size= in.nextInt();
       int arr[]=new int[arr_size];
       for(int i=0;i<arr_size;i++)
       {
          arr[i]=in.nextInt();
       }
      int search_elem_1=in.nextInt();
      int search_elem_2=in.nextInt();
      int flag=0;
      for(int i=0;i<arr_size;i++)
      {
         
        if(search_elem_1==arr[i] || search_elem_2==arr[i] )
        {
          flag=flag+1;
          System.out.println(i);
        }
        
        
      }
    if(flag<2)
        {
            System.out.println("-1");
        }
      
      
    }
}