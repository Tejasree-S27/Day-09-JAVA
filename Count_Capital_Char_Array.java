import java.util.*;
class Count_Capital_Char_Array
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();  
        // Array to store count of capital letters
        int c[] = new int[26];  
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            // Check if the character is uppercase letter
            if (ch >= 'A' && ch <= 'Z') 
            {
              c[ch - 'A']++; 
              }
        }
        System.out.println(Arrays.toString(c));  
    }
}
