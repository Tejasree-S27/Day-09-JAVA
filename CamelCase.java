import java.util.*;
public class CamelCase
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        String a=sc.next();
        String rev=" ";
        for(int i=0;i<a.length();i++)
        {
            char s=a.charAt(i);
            s^=32;
            rev+=s;
        }
        System.out.println(rev);
    }
}
