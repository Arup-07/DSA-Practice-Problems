/*LeetCode 29 : Divide two Integers
Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.
The integer division should truncate toward zero, which means losing its fractional part. For example, 8.345 would be truncated to 8, and -2.7335 would be truncated to -2.
Return the quotient after dividing dividend by divisor.
Note: Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231, 231 − 1]. For this problem, if the quotient is strictly greater than 231 - 1, then return 231 - 1, and if the quotient is strictly less than -231, then return -231.

Example 1:
Input: dividend = 10, divisor = 3
Output: 3
*/


import java.util.*;
class q84 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        q84 obj=new q84();
        int dividend=sc.nextInt();
        int divisor=sc.nextInt();
        int res=obj.divide(dividend,divisor);
        System.out.println(res);
    }
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor==-1)
            return Integer.MAX_VALUE;
        boolean n=(dividend<0)^(divisor<0);
        long a=Math.abs((long)dividend), b=Math.abs((long)divisor), q=0;
        while(a>=b)
        {
            long temp=b, m=1;
            while(a>=temp+temp)
            {
                temp+=temp;
                m+=m;
            }
            a-=temp;
            q+=m;
        }
        if(n)
            q=-q;
            
        return (int)q;
        
    }
}