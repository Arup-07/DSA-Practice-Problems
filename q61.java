/*LeetCode 2206: Divide Array Into Equal Pairs
You are given an integer array nums consisting of 2 * n integers.
You need to divide nums into n pairs such that:
Each element belongs to exactly one pair.
The elements present in a pair are equal.
Return true if nums can be divided into n pairs, otherwise return false.
Example 1:
Input: nums = [3,2,3,2,2,2]
Output: true
*/



import java.util.*;
public class q61 {
    public static void main(String[] args) {
        q61 obj = new q61();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
            nums[i] = sc.nextInt();
        System.out.println(obj.divideArray(nums));
    }
        public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=2)
        {
            if(nums[i]!=nums[i+1])
                return false;
        }
        return true;
    }
}