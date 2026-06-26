/* LeetCode 1480:Running Sum of 1d Array
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.
Example 1:
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4]. */


public class q17 {
    public static void main(String args[])
    {
        q17 ob = new q17();
        int n[]={1,2,3,4};
        int ans[]=ob.runningSum(n);
        for(int i:ans)
            System.out.print(i+" ");
    }
    public int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++)
            nums[i]+=nums[i-1];
        return nums;
    }
}
