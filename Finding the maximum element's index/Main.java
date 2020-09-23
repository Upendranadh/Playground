import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
      Scanner sc = new Scanner(System.in);
     int size = sc.nextInt();
     int list[]=new int[size];
    for(int index=0;index<size;index++)
    {
      list[index]= sc.nextInt();
    }
    largest_number_in_array(list,size);
  }
    public static void largest_number_in_array(int list[],int size)
    {
      int max_number=  list[0];
      int output=0;
       for(int index=1;index<size;index++)
       {
        if(list[index]>max_number)
        {
          max_number=list[index];
           output=index;
        }
      else
      {
         max_number=max_number;
      }
      
    }
    System.out.println(output);
    
    }
}