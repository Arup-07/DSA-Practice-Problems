/*LeetCode 1221 : Split A String in Balanced Strings
Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
Given a balanced string s, split it into some number of substrings such that:
Each substring is balanced.
Return the maximum number of balanced strings you can obtain.
Example 1:
Input: s = "RLRRLLRLRL"
Output: 4
*/




import java.util.*;
class q81{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        q81 obj=new q81();
        String s=sc.next();
        int res=obj.balancedStringSplit(s);
        System.out.println(res);
    }
    public int balancedStringSplit(String s) {
        int c=0,a=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='R')
                a++;
            else
                a--;
            if(a==0)
                c++;
        }
        return c;
    }
}