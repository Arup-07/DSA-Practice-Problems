/*LeetCode 258:Add Digits
Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
Example 1:
Input: num = 38
Output: 2
*/



import java.util.*;
class q62 {
    public static void main(String[] args) {
        q62 obj = new q62();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(obj.addDigits(n));
    }
    public int addDigits(int num) {
        if(num<10)
            return num;
        else
        {
            while(num>9)
            {
                num=add(num);
            }
        }
        return num;
    }
    public int add(int n)
    {
        int s=0;
        while(n>0)
        {
            s+=n%10;
            n/=10;
        }
        return s;
    }
}