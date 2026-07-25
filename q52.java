/*LeetCode 1991: Find the Middle Index in the Array
Given a 0-indexed integer array nums, find the leftmost middleIndex (i.e., the smallest amongst all the possible ones).
A middleIndex is an index where nums[0] + nums[1] + ... + nums[middleIndex-1] == nums[middleIndex+1] + nums[middleIndex+2] + ... + nums[nums.length-1].
If middleIndex == 0, the left side sum is considered to be 0. Similarly, if middleIndex == nums.length - 1, the right side sum is considered to be 0.
Return the leftmost middleIndex that satisfies the condition, or -1 if there is no such index.
Example 1:
Input: nums = [2,3,-1,8,4]
Output: 3
*/




import java.util.*;
class q52 {
    public static void main(String[] args) {
        q52 obj = new q52();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
            nums[i]=sc.nextInt();
        System.out.println(obj.findMiddleIndex(nums));
    }
    public int findMiddleIndex(int[] nums) {
        int sum=0,s=0;
        for(int n:nums)
            sum+=n;
        for(int i=0;i<nums.length;i++)
        {
            if(i>0)
            s+=nums[i-1];
            if(s==sum-s-nums[i])
                return i;
        }
        return -1;
    }
}