/*LeetCode 326:Power Of Three
Given an integer n, return true if it is a power of three. Otherwise, return false.
An integer n is a power of three, if there exists an integer x such that n == 3x.
Example 1:
Input: n = 27
Output: true
*/



import java.util.*;
class q46 {
    public static void main(String[] args) {
        q46 obj = new q46();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(obj.isPowerOfThree(n));
    }
    public boolean isPowerOfThree(int n) {
        if(n<1)
            return false;
        else
        {
            int i=n;
            while(n%3==0)
            {
                n/=3;
            }
            if(n==1)
                return true;
            else
                return false;
        }
        }
}