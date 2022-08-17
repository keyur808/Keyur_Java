public class JavaPatternsLoops
{
    public static void main(String[] args)
    {
        for(int i=1;i<=4;i++)
        {                                   //Nested For loop
            // for(int j=1;j<=4;j++)
             for(int j=1;j<=i;j++)
            {
                System.out.print(" *");
            }
            System.out.print("\n");


        }

    }
}
