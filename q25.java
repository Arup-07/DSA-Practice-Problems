/*LeetCode 169: Majority Element
 Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
Example 1:
Input: nums = [3,2,3]
Output: 3*/

import java.util.HashMap;
class q25 
{
    public static void main(String args[])
    {
        int[] nums = {3,2,3};
        q25 obj = new q25();
        int result = obj.majorityElement(nums);
        System.out.println(result);
    }
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
           map.put(nums[i],0);
        for(int n:nums)
            map.put(n,map.get(n)+1);
       int max=map.get(nums[0]), a=nums[0];
         for(int n:nums)
            if(map.get(n)>max)
            {
                max= map.get(n);
                a=n;
            }
            return a;
        
    }
}