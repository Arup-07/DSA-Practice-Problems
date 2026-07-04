/*LeetCode 238:Product Of Array Except Self
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.
Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]
*/



public class q29 {
    public static void main(String[] args) {
        q29 obj = new q29();
        int[] nums = {1,2,3,4};
        int[] ans = obj.productExceptSelf(nums);
        for(int i=0;i<ans.length;i++)
            System.out.print(ans[i]+" ");
    }
    public int[] productExceptSelf(int[] nums) {
        int c=0,p=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
                p*=nums[i];
            else
                c++;
        }
        int a[]=  new int[nums.length];
        if(c!=0)
        {
            for(int i=0;i<nums.length;i++)
                if(nums[i]!=0 || nums.length==c || c>1)
                    a[i]=0;
                else
                    a[i]=p;
        }
        else
        for(int i=0;i<nums.length;i++)
            a[i]=p/nums[i];
        return a;
    }
}
