public class PalindromeNum
{
    public static void main(String[] args)
    {
        int n=123,r,s=0;
        int t=n;
        while (n>0)
        {
            r=n%10;
            n=n/10;
            s=s*10+r;
        if(t==s)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
        }

    }
}
