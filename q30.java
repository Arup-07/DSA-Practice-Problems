/*LeetCode 53: Maximum Subarray
Given an integer array nums, find the subarray with the largest sum, and return its sum.
Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
*/



class q30 {
    public static void main(String[] args) {
        q30 obj = new q30();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(obj.maxSubArray(nums));
    }
    public int maxSubArray(int[] nums) {
        int max=nums[0],curr=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            curr=Math.max(nums[i],curr+nums[i]);
            max=Math.max(max,curr);
        }
        return max;
    }
}