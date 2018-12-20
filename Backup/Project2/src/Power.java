import java.util.Scanner;

public class Power
{
    public static int test(int n)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if it a pwr of 4");
        int n = sc.nextInt();
        while (n != 1)
        {
            if (n % 4 != 0)
            {
                return 0;
            }
            n /= 4;
        }
        return 1;

        if(test(n)==0)
        {
            System.out.println("not a power of 4");
        }else
        {
            System.out.println("power of 4");
        }
    }
}
