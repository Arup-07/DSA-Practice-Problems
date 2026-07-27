/*LeetCode 1009: Complement of Base 10 Integer
The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its binary representation.
For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
Given an integer n, return its complement.
Example 1:
Input: n = 5
Output: 2
*/



import java.util.*;
public class q55 {
    public static void main(String[] args) {
        q55 obj = new q55();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(obj.bitwiseComplement(n));
    }
    public int bitwiseComplement(int n) {
       int mask = 1;
       while (mask < n)
        mask = (mask << 1) | 1;
        return n ^ mask;
    }
}

