public class SwappingNum2
{
    public static void main(String[] args)
    {
        int a = 5;
        int b = 6;

     //   b = a+b;
        b = a+b-(a=b);

        System.out.println(a + " " + b);

    }
}
