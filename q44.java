/*LeetCode 1979:Find Greatest Common Divisor of Array
Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.
The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.
Example 1:
Input: nums = [2,5,6,9,10]
Output: 2
*/




import java.util.Scanner;
class q44 {
    public static void main(String[] args) {
        q44 obj = new q44();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
            nums[i]=sc.nextInt();
        System.out.println(obj.findGCD(nums));
    }
    public int findGCD(int[] nums) {
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<=min && nums[i]!=0 )
                min=nums[i];
            if(nums[i]>=max && nums[i]!=0)
                max=nums[i];
        }
        while(min!=0)
        {
            int temp=max%min;
            max=min;
            min=temp;
        }
        return max;
    }
}