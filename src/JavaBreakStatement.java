public class JavaBreakStatement
{
    public static void main(String[] args)
    {
        // break switch loop
        Java:
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=8;j++)
            {
                if(i==4)
                    break Java;      //Labeled Break Statement;
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }
}
