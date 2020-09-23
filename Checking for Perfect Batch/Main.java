import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
     int list[]=new int[size];
    for(int i=0;i<size;i++)
    {
      list[i] =sc.nextInt();
    }
   perfect_batch(list, size);
}

public static void perfect_batch(int list[], int size)
{
boolean is_perfect_batch = true;
int batch_sum = list[0] + list[1] + list[2];
for(int index = 3; index <= size-1 ; index = index + 3)
{
int curr_batch_sum = list[index] + list[index + 1] + list[index + 2];
if(curr_batch_sum != batch_sum)
{
is_perfect_batch = false;
}
}
if(is_perfect_batch == true)
{
System.out.println("Perfect Batch");
}
else
{
System.out.println("Not a Perfect Batch");
}
}
}