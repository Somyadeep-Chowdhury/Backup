package com.stackroute.unittest.pe1;

public class PalindromeChecker
{
    public static int checkpalindrome(int n)
    {
        int rev, sum=0, temp;
        temp = n;
        while(n!=0)
        {
            rev = n % 10;
            sum = sum * 10 + rev;
            n = n / 10;
        }
        if (sum == temp)
        {
            System.out.println("Palindrome");
        }
        return sum;
    }
}
