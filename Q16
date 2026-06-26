/*LeetCode 217: Contains Duplicate
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true
Explanation:
The element 1 occurs at the indices 0 and 3.*/

import java.util.HashSet;
class q16 {
    public static void main(String args[])
    {
        q16 ob = new q16();
        int n[]={1,2,5,1,6,7,9,1};
        System.out.println(ob.containsDuplicate(n));
    }
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        for(int i:nums)
        {
            if(set.contains(i))
                return true;
            set.add(i);
        }
        return false;
    }
}
