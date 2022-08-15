public class PatternExample
{
    public static void main(String[] args) {
        int i;
        int j;

        for (i = 1; i <= 5; i++)    // Rows
        {
            for (j = 1; j <= i; j++)        //Columns
            {
                if ((i+j )%2==0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");

            }System.out.println(" ");
        }
    }
}
