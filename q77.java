/*LeetCode 191: Number of 1 bits
Given a positive integer n, write a function that returns the number of set bits in its binary representation (also known as the Hamming weight).
Example 1:
Input: n = 11
Output: 3
*/



import java.util.*;
class q77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        q77 obj = new q77();
        int result = obj.hammingWeight(n);
        System.out.println(result);
    }
    public int hammingWeight(int n) {
        int c=0;
        while(n>0)
        {
            if(n%2==1)
                c++;
            n/=2;
        }
        return c;
    }
}