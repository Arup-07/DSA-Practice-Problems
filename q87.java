/*LeetCode 3471:Find the Largest Almost Missing Integer
You are given an integer array nums and an integer k.
An integer x is almost missing from nums if x appears in exactly one subarray of size k within nums.
Return the largest almost missing integer from nums. If no such integer exists, return -1.
A subarray is a contiguous sequence of elements within an array.
Example 1:
Input: nums = [3,9,2,1,7], k = 3
Output: 7
*/




import java.util.*;
class q87 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans= new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            List<Integer> row= new ArrayList<>();
            row.add(1);
            for(int j=1;j<i;j++)
                row.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
        
        if(i>0)
            row.add(1);
        ans.add(row);
        }
            return ans;

    }
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= nums.length - k; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = i; j < i + k; j++) {
                set.add(nums[j]);
            }
            for (int x : set) {
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
        }
        int ans = -1;
        for (int x : map.keySet()) {
            if (map.get(x) == 1) {
                ans = Math.max(ans, x);
            }
        }
        return ans;
    }
}