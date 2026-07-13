/*LeetCode 33:Search in Rotated Sorted Array
There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly left rotated at an unknown index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be left rotated by 3 indices and become [4,5,6,7,0,1,2].
Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
You must write an algorithm with O(log n) runtime complexity.
Example 1:
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
*/



class q39 {
    public static void main(String[] args) {
        q39 ob = new q39();
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int result = ob.search(arr, target);
        System.out.println(result);
    }
    public int search(int[] nums, int target) {

        int mid = 0;
        int max = 0;
        int l, r;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1])
                break;
            else
                max = i;
        }
        if (nums[0] <= target) {
            l = 0;
            r = max;
        } else {
            l = max + 1;
            r = nums.length - 1;
        }
        while (l <= r) {

            mid = l + (r - l) / 2;

            if (nums[mid] == target)
                return mid;

            else if (target < nums[mid])
                r = mid - 1;

            else
                l = mid + 1;
        }

        return -1;
    }
}