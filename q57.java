/*LeetCode 136: Single Number
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.
Example 1:
Input: nums = [2,2,1]
Output: 1
*/

import java.util.*;
class q57 {
    public static void main(String[] args) {
        q57 obj = new q57();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
            nums[i] = sc.nextInt();
        System.out.println(obj.singleNumber(nums));
    }
    public int singleNumber(int[] nums) {
        int r=0;
        for(int n:nums)
            r^=n;
        return r;
    }
}