import java.util.Random;

public class EnhanceForLoop
{
    public static void main(String[] args)
    {
        int[] nums = new int[10];
        Random r = new Random();
        for(int i = 0; i < 10; i++)
        {
            nums[i]=r.nextInt(50);
        }
        // for(int i=0;i<10;i++)
        // for(int i=0;i<nums.length;i++)
        for(int n : nums)
        {
            // System.out.println(nums[i]);
            System.out.println(n);
        }
    }
}
