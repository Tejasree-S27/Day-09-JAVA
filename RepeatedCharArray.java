import java.util.*;
class RepeatedCharArray 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();  
        a = a.toUpperCase();
        int c[] = new int[26];
        for (int i = 0; i < a.length(); i++) 
        {
            char ch = a.charAt(i);
            // Check if character is between 'A' and 'Z' (uppercase letters)
            if (ch >= 'A' && ch <= 'Z') 
            {
                c[ch - 'A']++;  
            }
        }
        // Finding the repeated character
        int max = 0;
        int index = 0;
        for (int i = 0; i < 26; i++) 
        {
            if (c[i] > max) 
            {
                max = c[i];
                index = i;
            }
        }
        System.out.println("The Repeated character is: " + (char)(index + 'A'));
    }
}
