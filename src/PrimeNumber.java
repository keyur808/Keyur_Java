public class PrimeNumber {
    public static void main(String[] args) {

/*        int num = 4;
        boolean isPrime = true;

//        for(int i=2;i<num;i++)
//        for(int i=2;i<num/2;i++)
        for(int i=2;i<Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                isPrime = false;
                break;
            }
        }

        if(isPrime)
        {
            System.out.println(num + " is a Prime Number");
        }
        else
        {
            System.out.println("Not a Prime Number");
        }

    }
}

*/
        int n = 115;
        boolean b = isPrime(n);
        if (b)
            System.out.println("Its a Prime number.");
        else
            System.out.println("Its not a Prime number.");
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}