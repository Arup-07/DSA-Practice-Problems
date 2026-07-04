/*LeetCode 35: Search Insertion Position
    Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
    You must write an algorithm with O(log n) runtime complexity.
    Example 1:
    Input: nums = [1,3,5,6], target = 5
    Output: 2
*/


class q27 {
    public static void main(String[] args) {
        q27 obj = new q27();
        int[] nums = {1,3,5,6};
        int target = 5;
        System.out.println(obj.searchInsert(nums,target));
    }
    public int searchInsert(int[] nums, int target) {
        int i=0;
        for(;i<nums.length;i++)
            if(target==nums[i])
                return i;
        for(i=0;i<nums.length;i++)
            if(target<nums[i])
               break;
        return i;
    }
}