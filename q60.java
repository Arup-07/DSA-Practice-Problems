/*LeetCode 342:Power Of Four
Given an integer n, return true if it is a power of four. Otherwise, return false.
An integer n is a power of four, if there exists an integer x such that n == 4x.
Example 1:
Input: n = 16
Output: true
*/



import java.util.*;
public class q60 {
    public static void main(String[] args) {
        q60 obj = new q60();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(obj.isPowerOfFour(n));
    }
    public boolean isPowerOfFour(int n) {
        if(n<=0)
            return false;
        while(n%4==0)
            n/=4;
        return n==1;
    }
}
