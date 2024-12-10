import java.util.*;
class Anagram 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int c1[]=new int[256];
        int c2[]=new int[256];
        for(int i=0;i<s1.length();i++)
        {
            c1[s1.charAt(i)]++;
        }
        for(int i=0;i<s2.length();i++)
        {
            c2[s2.charAt(i)]++;
        }
        boolean ans=true;
        for(int i=0;i<256;i++)
        {
            if(c1[i]!=c2[i])
            {
                ans=false;
                break;
            }
        }
        System.out.println(ans?"Anagram":"not a Anagram");
    }
}