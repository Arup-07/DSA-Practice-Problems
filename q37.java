/*LeetCode 69:Sqrt(x)
Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
You must not use any built-in exponent function or operator.
For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
Example 1:
Input: x = 4
Output: 2  
*/




import java.util.*;
class q27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        q27 solution = new q27();
        int x = sc.nextInt();
        int result = solution.mySqrt(x);
        System.out.println("The integer square root of " + x + " is: " + result);
    }
    public int mySqrt(int x) {
        return (int)Math.sqrt(x);
    }
}