/*Leetcode 9:Palindrome Number
Given an integer x, return true if x is a palindrome, and false otherwise.
Example 1:
Input: x = 121
Output: true*/


public class q2 {
    public boolean isPalindrome(int x) {
        if(x<0)
           return false;
        else
        {
            int rev=0,n=x;
            while(x!=0)
            {
                rev=rev*10+x%10;
                x/=10;
            }
            if(rev==n)
            return true;
            else
            return false;
        }
    }
}
