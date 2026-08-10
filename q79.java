/*LeetCode 367: Valid Perfect Square
Given a positive integer num, return true if num is a perfect square or false otherwise.
A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.
You must not use any built-in library function, such as sqrt.
Example 1:
Input: num = 16
Output: true
*/





import java.util.*;
class q79 {
    public static void main(String args[])
    {
        
    }
    public boolean isPerfectSquare(int num) {
        long l = 1;
        long r = num;
        while (l <= r) {
            long mid = l + (r - l) / 2;
            long square = mid * mid;
            if (square == num)
                return true;
            else if (square < num)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return false;
    }
}