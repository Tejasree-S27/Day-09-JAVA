import java.util.Scanner;
public class TogglingCase 
{
    public static void main(String[] args) 
    {
      Scanner sc=new Scanner(System.in);
      // Read the first character of the string
      char s=sc.next().charAt(0);  
        // Toggle case of the character using XOR
        s ^= 32; 
        System.out.println(s);
    }
}
