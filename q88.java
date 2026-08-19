/*LeetCode 448:Find all Numbers Disappeared in an Array
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
*/




import java.util.*;
class q88 {
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
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> arr= new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int in=Math.abs(nums[i])-1;
            if(nums[in]>0)
                nums[in]=-nums[in];
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                arr.add(i+1);
            }
        }
        return arr;
    }
}