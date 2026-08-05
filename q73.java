/*LeetCode 2670:Find the distinct Difference Array
You are given a 0-indexed array nums of length n.
The distinct difference array of nums is an array diff of length n such that diff[i] is equal to the number of distinct elements in the suffix nums[i + 1, ..., n - 1] subtracted from the number of distinct elements in the prefix nums[0, ..., i].
Return the distinct difference array of nums.
Note that nums[i, ..., j] denotes the subarray of nums starting at index i and ending at index j inclusive. Particularly, if i > j then nums[i, ..., j] denotes an empty subarray.
Example 1:
Input: nums = [1,2,3,4,5]
Output: [-3,-1,1,3,5]
*/




import java.util.*;
class q73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        q73 obj = new q73();
        int[] result = obj.distinctDifferenceArray(nums);
        System.out.println(Arrays.toString(result));
    }
    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] ans = new int[n];
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
            left[i] = set.size();
        }
        set.clear();
        for (int i = n - 1; i >= 0; i--) {
            set.add(nums[i]);
            right[i] = set.size();
        }
        for (int i = 0; i < n; i++) {
            int rightDistinct = (i == n - 1) ? 0 : right[i + 1];
            ans[i] = left[i] - rightDistinct;
        }
        return ans;
    }
}