/*LeetCode 349:Intersection of two arrays
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
*/




import java.util.*;
class q91 {
    public static void main(String args[])
    {
        q91 ob= new q91();
        int nums1[]= {1,2,2,1};
        int nums2[]= {2,2};
        int res[]=ob.intersection(nums1,nums2);
        for(int i=0;i<res.length;i++)
            System.out.print(res[i]+" ");
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set= new HashSet<>();     
        HashSet<Integer> ans= new HashSet<>();     
        for(int x:nums1)
            set.add(x);
        for(int x:nums2)
        {
            if(set.contains(x))
                ans.add(x);
        }
        int res[]= new int[ans.size()];
        int i=0;
        for(int x:ans)
            res[i++]=x;
        return res;
    }
}