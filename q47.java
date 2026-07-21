/*LeetCode 268:Missing Numbers
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
Example 1:
Input: nums = [3,0,1]
Output: 2
*/


import java.util.*;
class q47 {
    public static void main(String[] args) {
        q47 obj = new q47();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
            nums[i] = sc.nextInt();
        System.out.println(obj.missingNumber(nums));
    }
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(i!=nums[i])
                return i;
        }
        return nums.length;
    }
}