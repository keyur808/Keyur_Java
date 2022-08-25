public class ArrayinJava
{
    public static void main(String[] args)
    {
        int a[] = new int[5];
        // 1 2 3 4 5
        // 0 1 2 3 4

        //for (int i=0;i<5;i++)
        for (int i=0;i<a.length;i++)
        {
            a[i]=i+1;
        }

        //for (int i=0;i<5;i++)
        //for (int i=0;i<a.length;i++)
        for (int i : a)     //enhance for loop
            System.out.println(i);
            //System.out.println(a[i]);
    }
}
