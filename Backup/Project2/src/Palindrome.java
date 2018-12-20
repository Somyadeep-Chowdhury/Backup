import java.util.Scanner;

public class Palindrome
{
    public static void test()
    {
        int temp,sum=0,rev,n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = sc.nextInt();
        temp = n;
        while(n>0)
        {
            rev = n%10;
            sum = sum*10 + rev;
            n = n / 10;
        }
        if(temp == sum)
        {
            System.out.println("Palindome");
        }else
        {
            System.out.println("Not Palindrome");
        }
    }
}

