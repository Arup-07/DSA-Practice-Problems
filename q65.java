/*LeetCode 1281:Subtract the Product and Sum Of Digits Of an Integer
Given an integer number n, return the difference between the product of its digits and the sum of its digits.
Example 1:
Input: n = 234
Output: 15 
*/




import java.util.*;
public class q65 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        q65 obj=new q65();
        System.out.println(obj.subtractProductAndSum(n));
    }
    public int subtractProductAndSum(int n) {
        int s=0,p=1;
        while(n>0)
        {
            int r=n%10;
            s+=r;
            p*=r;
            n/=10;
        }
        return p-s;
    }
}
