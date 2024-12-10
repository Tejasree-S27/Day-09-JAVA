import java.util.Scanner;
public class Uppercase_Lowercase 
{
    public static void main(String[] args) 
    {
      Scanner sc=new Scanner(System.in);
      char s=sc.next().charAt(0);  
      //Checking condition for uppercase & lowercase
      if((s&32)==0)
      //Printing Uppercase
      System.out.println("Upper Case");
      else
      //printing Lowercase
      System.out.println("Lower Case");
    }
}
