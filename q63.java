/*LeetCode 2574:Left and Right Sum Differences
You are given a 0-indexed integer array nums of size n.
Define two arrays leftSum and rightSum where:
leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
Return an integer array answer of size n where answer[i] = |leftSum[i] - rightSum[i]|.
Example 1:
Input: nums = [10,4,8,3]
Output: [15,1,11,22]
*/

import java.util.*;
public class q63 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
            nums[i]=sc.nextInt();
        q63 obj=new q63();
        int ans[]=obj.leftRightDifference(nums);
        for(int i=0;i<ans.length;i++)
            System.out.print(ans[i]+" ");
    }
    public int[] leftRightDifference(int[] nums) {
        int r[]= new int[nums.length];
        int l[]= new int[nums.length];
        l[0]=0;
        for(int i=1;i<nums.length;i++)
            l[i]=l[i-1]+nums[i-1];  
        int t=l[nums.length-1]+nums[nums.length-1];
        for(int i=0;i<nums.length;i++)
            r[i]=t-nums[i]-l[i];  
        for(int i=0;i<nums.length;i++)
            r[i]=Math.abs(l[i]-r[i]);  
        return r;
        
    }
}
