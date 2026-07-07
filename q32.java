/*LeetCode 3754: Concatenate Non-Zero Digits and Multiply by Sum I
You are given an integer n.
Form a new integer x by concatenating all the non-zero digits of n in their original order. If there are no non-zero digits, x = 0.
Let sum be the sum of digits in x.
Return an integer representing the value of x * sum.
Example 1:
Input: n = 10203004
Output: 12340
 */


class q32 {
    public static void main(String[] args) {
        q32 obj = new q32();
        int n = 123405;
        System.out.println(obj.sumAndMultiply(n));
    }
    public long sumAndMultiply(int n) {
        long sum=0,b=0,c=0;
        while(n!=0)
        {
            int temp=n%10;
            sum+=temp;
            if(temp!=0)
            {
                b+=(int)Math.pow(10,c++)*temp;
            }
            n/=10;
        }
        return sum*b;
        
    }
}