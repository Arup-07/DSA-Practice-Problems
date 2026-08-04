/*LeetCode 3731: Find Missing Elements
You are given an integer array nums consisting of unique integers.
Originally, nums contained every integer within a certain range. However, some integers might have gone missing from the array.
The smallest and largest integers of the original range are still present in nums.
Return a sorted list of all the missing integers in this range. If no integers are missing, return an empty list.
Example 1:
Input: nums = [1,4,2,5]\
Output: [3]
*/





import java.util.*;
class q72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        q72 obj = new q72();
        List<Integer> result = obj.findMissingElements(nums);
        System.out.println(result);
    }
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();
        for (int x : nums) {
            min = Math.min(min, x);
            max = Math.max(max, x);
            set.add(x);
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = min + 1; i < max; i++) {
            if (!set.contains(i))
                ans.add(i);
        }
        return ans;
    }
}