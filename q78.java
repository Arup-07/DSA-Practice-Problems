/*LeetCode 190: Reverse Bits
Reverse bits of a given 32 bits signed integer.
Example 1:
Input: n = 43261596
Output: 964176192
*/



import java.util.*;
class q78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        q78 obj = new q78();
        int result = obj.reverseBits(n);
        System.out.println(result);
    }
    public int reverseBits(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            ans = (ans << 1) | (n & 1);
            n >>>= 1;
        }
        return ans;
    }
}