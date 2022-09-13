public class StaticKeyword
{
    public static void main(String[] args)
    {
        Abcd.show();

    }
}
class Abcd
{
    static int i=5;
    public static void show()
    {
        System.out.println("Hi");
        System.out.println(i);
    }
}

