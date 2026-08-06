/*LeetCode 3345:Smallest divisible number by digit product
You are given two integers n and t. Return the smallest number greater than or equal to n such that the product of its digits is divisible by t.
Example 1:
Input: n = 10, t = 2
Output: 10
*/




import java.util.*;
class q74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        q74 obj = new q74();
        int result = obj.smallestNumber(n, t);
        System.out.println(result);
    }
    public int smallestNumber(int n, int t) {
       int dup=n,p=1;
       do
       {
            p=1;
            while(n>0)
            {
                p*=n%10;
                n/=10;
            }
            if(p%t==0)
                return dup;
            n=++dup;
       }while(true);
    }
}