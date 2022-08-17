/*
         1 1 2 3 5 8 13 21 . . . . N
 */

import java.util.Scanner;

public class Fibonacci_Java
{
    public static void main(String[] args)
    {
/*      int k,a=1,b=1;
        k=0;
        System.out.print("1 1 ");
        while (k<=50)
 */
        int k,a=1,b=1;
        Scanner sc = new Scanner(System.in);
        k=0;
        System.out.println("Enter any Number");
        int n = sc.nextInt();
        System.out.print("1 1 ");
        while(k<=n)
//        while (k<=50)
        {
            k=a+b;
            if(k>=n)
                break;
            System.out.print(k + " ");
            a=b;
            b=k;
        }

    }
}
