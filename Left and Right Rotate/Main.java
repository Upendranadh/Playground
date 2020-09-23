import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int size=in.nextInt();
		int array[]=new int[size];
		for(int index=0;index<=size-1;index++)
		{
		    array[index]=in.nextInt();
		}
		int oddsize=0;
		int evensize=0;
		if(size%2==0)
		{
		  oddsize=size-(size/2);
		   evensize=size-(size/2);
		}
		else
		{
		  oddsize= size-(size/2);
		  evensize=(size-1)-(size/2);
		   
		}
		int oddarray[]=new int[oddsize];
		int evenarray[]=new int[evensize];
		
		int oddcount=0;
		int evencount=0;
		for(int index=0;index<=size-1;index++)
		{
		    if((index+1)%2!=0)
		    {
		       oddarray[oddcount]=array[index];
		       oddcount++;
		    }
		    else
		    {
		        evenarray[evencount]=array[index];
		        evencount++;
		    }
		  
		}
	
		int numberofrotaions=in.nextInt();
		int tempoddlastelement=0;
		int tempevenfisrtelement=0;
		int k=1;
      for(int index=1;index<=numberofrotaions;index++)
      {
          tempoddlastelement=oddarray[oddcount-1];
          tempevenfisrtelement=evenarray[0];
          for(int j=1;j<oddsize;j++)
          {
               oddarray[oddcount-1]=oddarray[oddcount-2];
               oddcount--;
           }
         for(k=1;k<evencount;k++)
             {
                evenarray[k-1]=evenarray[k];
               
             }
         
          oddarray[0]=tempoddlastelement;
          evenarray[evencount-1]=tempevenfisrtelement;
          oddcount=oddsize;
          
         }
      int y=0;
      int z=0;
    for(int index=0;index<=size-1;index++)
    {
        if((index+1)%2!=0)
        {
            System.out.print(oddarray[y] + " ");
            y++;
        }
        else
        {
            System.out.print(evenarray[z] +" ");
            z++;
        }
    }
	   
	}
}
