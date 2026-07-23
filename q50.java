/*LeetCode 507:Perfect Number
A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself. A divisor of an integer x is an integer that can divide x evenly.
Given an integer n, return true if n is a perfect number, otherwise return false.
Example 1:
Input: num = 28
Output: true
*/


import java.util.*;
public class q50 {
    public static void main(String[] args) {
        q50 obj = new q50();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(obj.checkPerfectNumber(num));
    }
    public boolean checkPerfectNumber(int num) {
        int sum=1;
        if(num<=1)
            return false;
        else{
            for(int i=2;i<num;i++)
            {
            if(num%i==0)
                sum+=i+num%i;
            }
            if(sum==num)
                return true;
            else
                return false;
        }
       
    }
}
