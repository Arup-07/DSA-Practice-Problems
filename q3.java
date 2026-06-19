/*Leetcode 509:Fibonacci Numbers
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
Given n, calculate F(n).

Example 1:
Input: n = 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.*/

class q3 {
    public int fib(int n) {
        if(n<=0 )
          return 0;
        else if(n==1 || n==2)
          return 1;
        else
        {
            int c=0;
            for(int a=1,b=1,i=3;i<=n;i++)
            {
                c=a+b;
                a=b;
                b=c;
            }
            return c;
        }
    }
}