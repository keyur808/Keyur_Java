public class Shorthand
{
    public static void main(String[] args)
    {
        // int i=5;
        // i += 2; // i = i + 2;

        byte b = 8;

        // b = b * 2.5; // Double 20.0  --- b *= 2.5
        b *= 2.5;  // T(E1) op E2 // b * 2.5
        System.out.println(b);
    }
}
