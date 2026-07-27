/*LeetCode 1464:Maximum Product Of Two elements in an Array
Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).
Example 1:
Input: nums = [3,4,5,2]
Output: 12 
*/



import java.util.*;
class q54 {
    public static void main(String[] args) {
        q54 obj = new q54();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
            nums[i]=sc.nextInt();
        System.out.println(obj.maxProduct(nums));
    }
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int l=nums.length-1;
        return Math.max((nums[l-1]-1)*(nums[l]-1),(nums[0]-1)*(nums[1]-1));
    }
}