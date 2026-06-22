/*Leetcode 1342: Number of Steps to Reduce a Number to Zero
Given a non-negative integer num, return the number of steps to reduce it to zero. If the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
Example 1:
Input: num = 14
Output: 6
Explanation: Step 1) 14 is even; divide by 2 and obtain 7
*/

public class q9 {
    public static void main(String[] args) {
        q9 obj=new q9();
        int num=14;
        System.out.println(obj.numberOfSteps(num));
    }
    public int numberOfSteps(int num) {
        int c=0;
        while(num!=0)
        {
          if(num%2==0)
             num/=2;
          else
            num-=1;
          c++;
        }
        return c;
    }
}
