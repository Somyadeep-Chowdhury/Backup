import java.util.Scanner;

public class PalindromeI
{
    public static void test()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter: ");
        String s=sc.nextLine();
        StringBuffer sb = new StringBuffer(s);
        if(s.equals(sb.reverse().toString()))
        {
            System.out.println("palindrome");
            System.out.println(s);
        }else
        {
            System.out.println("Not Palindrome");
        }
    }
}
