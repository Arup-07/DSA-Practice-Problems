/*LeetCode 2769: Find the Maximum Achievable Number
Given two integers, num and t. A number x is achievable if it can become equal to num after applying the following operation at most t times:
Increase or decrease x by 1, and simultaneously increase or decrease num by 1.
Return the maximum possible value of x.
Example 1:
Input: num = 4, t = 1
Output: 6
Explanation:
Apply the following operation once to make the maximum achievable number equal to num:
Decrease the maximum achievable number by 1, and increase num by 1. */



class q21 {
    public static void main(String args[])
    {
        q21 ob = new q21();
        int num=4, t=1;
        System.out.println(ob.theMaximumAchievableX(num,t));
    }
    public int theMaximumAchievableX(int num, int t) {
        return num+2*t;
    }
}