/* LeetCode 1331: Rank Transform of an array
Given an array of integers arr, replace each element with its rank.
The rank represents how large the element is. The rank has the following rules:
Rank is an integer starting from 1.
The larger the element, the larger the rank. If two elements are equal, their rank must be the same.
Rank should be as small as possible.
Example 1:
Input: arr = [40,10,20,30]
Output: [4,1,2,3]
*/

import java.util.*;

class q38 {
    public static void main(String[] args) {
       
    }

    public int[] arrayRankTransform(int[] arr) {
        int[] nums=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            nums[i]=arr[i];
        }
        Arrays.sort(nums);
        int ind=1;
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],ind++);
            }
        }
        for(int i=0;i<arr.length;i++){
            nums[i]=map.get(arr[i]);
        }
        return nums;
    }
}