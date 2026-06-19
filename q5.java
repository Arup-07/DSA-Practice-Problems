/*Leetcode 1137. N-th Tribonacci Number
The Tribonacci sequence T(n) is defined as follows:
T(0) = 0, T(1) = 1, T(2) = 1, and T(n+3) = T(n) + T(n+1) + T(n+2) for n >= 0.
Given n, return the value of T(n).
Example 1:
Input: n = 4
Output: 4*/


public class q5 {
    public int tribonacci(int n) {
        if(n<=0)
           return 0;
        else if(n==1 ||n==2)
           return 1;
        else
        {
            int d=0;
            for(int i=3,a=0,b=1,c=1;i<=n;i++,a=b,b=c,c=d)
            {
                d=a+b+c;
            }
            return d;
        }
    }
}
