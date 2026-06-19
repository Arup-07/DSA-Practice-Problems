/*Leetcode 1518. Water Bottles
Given numBottles and numExchange, return the maximum number of water bottles you can drink.
You can exchange numExchange empty water bottles from your collection for one full water bottle.
Example 1:
Input: numBottles = 9, numExchange = 3
Output: 13
Explanation: You can exchange 3 empty bottles for 1 full bottle, and then exchange the remaining 0 empty bottles for 0 more full bottles.*/

class q6 {
    public int numWaterBottles(int numBottles, int numExchange) {
        int x=numBottles;
        while(numBottles>=numExchange)
        {
            int a=numBottles/numExchange;
            x+=a;
            numBottles=a+numBottles%numExchange;
        }
        return x;
    }
}