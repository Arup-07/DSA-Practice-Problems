/*LeetCode 122: Best Time to Buy and Sell Stock II
You are given an array prices where prices[i] is the price of a given stock on the ith day.
On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.
Find and return the maximum profit you can achieve.
Example 1:
Input: prices = [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3*/



public class q18 {
    public static void main(String args[])
    {
        q18 ob = new q18();
        int n[]={1,2,3,4};
        int ans[]=ob.runningSum(n);
        for(int i:ans)
            System.out.print(i+" ");
    }
    public int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++)
            nums[i]+=nums[i-1];
        return nums;
    }
    public int maxProfit(int[] prices) {
        int sum=0;
        for(int i=1;i<prices.length;i++)
            if(prices[i]>prices[i-1])
                sum+=prices[i]-prices[i-1];
        return sum;
    }
}

