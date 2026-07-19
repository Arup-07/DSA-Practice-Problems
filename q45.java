/*LeetCode 414:Third Maximum Number
Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.
Example 1:
Input: nums = [3,2,1]
Output: 1
*/



import java.util.*;
class q45 {
    public static void main(String[] args) {
        q45 obj = new q45();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
            nums[i]=sc.nextInt();
        System.out.println(obj.thirdMax(nums));
    }
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int prev = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] != prev) {
                count++;
                prev = nums[i];
            }
            if (count == 3)
                return nums[i];
        }
        return nums[nums.length - 1];
    }
}