/*LeetCode 3658: GCD od Odd and Even Sums
You are given an integer n. Your task is to compute the GCD (greatest common divisor) of two values:
sumOdd: the sum of the smallest n positive odd numbers.
sumEven: the sum of the smallest n positive even numbers.
Return the GCD of sumOdd and sumEven.
Example 1:
Input: n = 4
Output: 4
*/

import java.util.*;
public class q75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        q75 obj = new q75();
        int result = obj.gcdOfOddEvenSums(n);
        System.out.println(result);
    }
    public int gcdOfOddEvenSums(int n) {
        int sumOdd=0,sumEven=0;
        for(int c=1,i=0;c<=n;c++,i+=2)
        {
            sumEven+=i+2;
            sumOdd+=i+1;
        }
        while(sumOdd!=0)
        {
            int temp=sumOdd;
            sumOdd=sumEven%sumOdd;
            sumEven=temp;
        }
        return sumEven;
        //return n; //since sumOdd= n^2 and sumEven=n(n+1) and gcd(n^2,n(n+1))=n
    }
}

