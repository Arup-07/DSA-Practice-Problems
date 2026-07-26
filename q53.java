/*LeetCode 628: Maximum Product of Three Numbers
Given an integer array nums, find three numbers whose product is maximum and return the maximum product.
Example 1:
Input: nums = [1,2,3]
Output: 6
*/




import java.util.*;
class q53
 {
    public static void main(String[] args) {
        q53 obj = new q53();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
            nums[i]=sc.nextInt();
        System.out.println(obj.maximumProduct(nums));
    }
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int l=nums.length-1;
        return Math.max(nums[l]*nums[l-1]*nums[l-2], nums[0]*nums[1]*nums[l]);
    }
}