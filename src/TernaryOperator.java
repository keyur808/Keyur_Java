public class TernaryOperator {
    public static void main(String[] args)
    {
        int i=4;
        int j=5;

        // if(i==1) //true
        //     j=6;
        // else
        //     j=7;

        j = i==1?6:7;
        System.out.println(j);

    }
}
