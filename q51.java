/*LeetCode 3536:Maximum Products Of Two Numbers
You are given a positive integer n.
Return the maximum product of any two digits in n.
Note: You may use the same digit twice if it appears more than once in n.
Example 1:
Input: n = 31
Output: 3
*/




import java.util.*;
public class q51 {
    public static void main(String[] args) {
        q51 obj = new q51();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(obj.maxProduct(n));
    }
    public int maxProduct(int n) {
        int h=0,sh=0;
        while(n>0)
        {
            int r=n%10;
            if(r>=h)
            {
                sh=h;
                h=r;
            }  
            else if(r>sh && r<h)
                sh=r;
            n/=10;
        }
        return h*sh;
    }
}