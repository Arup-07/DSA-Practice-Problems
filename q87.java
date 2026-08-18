/*LeetCode  */




import java.util.*;
class q87 {

    public int largestInteger(int[] nums, int k) {
        int ans = -1;
        for (int start = 0; start <= nums.length - k; start++) {
            for (int i = start; i < start + k; i++) {
                int count = 0;
                for (int j = start; j < start + k; j++) {
                    if (nums[i] == nums[j]) {
                        count++;
                    }
                }
                if (count == 1) {
                    ans = Math.max(ans, nums[i]);
                }
            }
        }
        return ans;
    }
}