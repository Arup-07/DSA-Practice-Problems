/*LeetCode 2996: Smallest Missing Integer Greater than Sequential Prefix Sum
You are given a 0-indexed array of integers nums.
A prefix nums[0..i] is sequential if, for all 1 <= j <= i, nums[j] = nums[j - 1] + 1. In particular, the prefix consisting only of nums[0] is sequential.
Return the smallest integer x missing from nums such that x is greater than or equal to the sum of the longest sequential prefix.
Example 1:
Input: nums = [1,2,3,2,5]
Output: 6
*/



import java.util.*;
class q80 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        q80 obj=new q80();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int res=obj.missingInteger(arr);
        System.out.println(res);
    }
    public int missingInteger(int[] nums) {
        int sum=nums[0];
        for(int i=1;i<nums.length;i++)
            if(nums[i]==nums[i-1]+1) 
                sum+=nums[i];
            else
                break;
        HashSet<Integer> set =new HashSet<>();
        for(int x:nums)
            set.add(x);
        while(set.contains(sum))
            sum++;
        return sum;
    }
}