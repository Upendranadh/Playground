import java.util.Scanner;
class Faculty
{
  public void salary(int basesalary)
  {
    System.out.println("Base Salary:"+" "+(basesalary));
  }
}
class CSE extends Faculty
{
  public void salary(int basesalary)
  {
    System.out.println("CSE Faculty:"+" "+(basesalary+3000));
  }
}
class IT extends CSE
{
  public void salary(int basesalary)
  {
    System.out.println("IT Faculty:"+" "+(basesalary+5000));
  }
}
class ECE extends IT
{
  public void salary(int basesalary)
  {
      System.out.println("ECE Faculty:"+" "+(basesalary+4500));
  }
}

class Main
{
  public static void main(String[] args)
  {
   Scanner in = new Scanner(System.in);
     int basesalary = in.nextInt();
    if(basesalary > 0)
    {
      Faculty obj1 = new Faculty();
      obj1.salary(basesalary);
      CSE obj2 = new CSE();
      obj2.salary(basesalary);
      IT obj3 = new IT();
      obj3.salary(basesalary);
      ECE obj4 = new ECE();
      obj4.salary(basesalary);
    }
else
{
  System.out.print("null");
}
  }
}
     
