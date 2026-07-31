/*LeetCode 2235:Add Two Integers
Given two integers num1 and num2, return the sum of the two integers.
Example 1:
Input: num1 = 12, num2 = 5
Output: 17
 */


import java.util.*;
public class q64 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        q64 obj=new q64();
        System.out.println(obj.sum(num1,num2));
    }
    public int sum(int num1, int num2) {
        return num1+num2;
    }
}
