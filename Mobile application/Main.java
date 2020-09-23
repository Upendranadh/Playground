class MyModel1 {
     int mega=2;
      public MyModel1(){
       System.out.println("Features of MyModel 1");
        System.out.println("Camera mega pixels:"+" "+mega);
      }
}
class MyModel2 extends MyModel1 {
  int pixels=5;
  int display=5;
     public MyModel2(){
       System.out.println("Features of MyModel 2");
       System.out.println("Camera mega pixels:"+" "+pixels);
        System.out.println("Lock mechanism: Fingerprint");
        System.out.println("Display size:"+" "+display);
     }
}
class MyModel2T extends MyModel2 {
     int PIXELS=16;
      int DISPLAYSIZE=6;
  public MyModel2T(){
    System.out.println("Features of MyModel 2T");
    System.out.println("Camera mega pixels:"+" "+PIXELS);
    System.out.println("Lock mechanism: Fingerprint");
    System.out.println("Display size:"+" "+ DISPLAYSIZE);
}
}
public class Main 
{
    public static void main(String[] args) 
    {
          MyModel2T obj1 = new MyModel2T();
    }
}