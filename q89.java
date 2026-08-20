/*LeetCode 3069:Distribute Elements Into Two Arrays I
You are given a 1-indexed array of distinct integers nums of length n.
You need to distribute all the elements of nums between two arrays arr1 and arr2 using n operations. In the first operation, append nums[1] to arr1. In the second operation, append nums[2] to arr2. Afterwards, in the ith operation:
If the last element of arr1 is greater than the last element of arr2, append nums[i] to arr1. Otherwise, append nums[i] to arr2.
The array result is formed by concatenating the arrays arr1 and arr2. For example, if arr1 == [1,2,3] and arr2 == [4,5,6], then result = [1,2,3,4,5,6].
Return the array result.

Example 1:
Input: nums = [2,1,3]
Output: [2,3,1]
*/
class q89 {
    public static void main(String args[])
    {
        q89 ob= new q89();
        int nums[]= {2,1,3};
        int res[]=ob.resultArray(nums);
        for(int i=0;i<res.length;i++)
            System.out.print(res[i]+" ");
    }
    public int[] resultArray(int[] nums) {
        int l=nums.length,p=1,q=1;
        int a[]= new int[l];
        int b[]= new int[l];
        a[0]= nums[0];
        b[0]=nums[1];
        for(int i=2;i<l;i++)
        {
            if(a[p-1]>b[q-1])
                a[p++]=nums[i];
            else
                b[q++]=nums[i];
        }       
        int res[]=  new int[l];
        for(int i=0;i<p;i++)
            res[i]=a[i];
        for(int i=p,j=0;i<l;i++)
            res[i]=b[j++];
        return res;
    }
}