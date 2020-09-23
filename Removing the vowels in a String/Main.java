import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String str1 = str.toLowerCase();
        for(int i=0; i<str.length();i++)
        {
            
            if(str1.charAt(i) != 'a' && str1.charAt(i) != 'e' && str1.charAt(i) != 'i' && str1.charAt(i) != 'o' && str1.charAt(i) !='u')
            
                  System.out.print(str.charAt(i));
    }
        
}
}

