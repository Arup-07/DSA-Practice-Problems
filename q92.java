/*LeetCode 3622: Check Divisibility by Digit Sum and Product 
You are given a positive integer n. Determine whether n is divisible by the sum of the following two values:
The digit sum of n (the sum of its digits).
The digit product of n (the product of its digits).
Return true if n is divisible by this sum; otherwise, return false.
Example 1:
Input: n = 99
Output: true
*/
class q92 {
    public static void main(String args[])
    {
        q92 ob= new q92();
        int n=99;
        boolean res=ob.checkDivisibility(n);
        System.out.print(res);
    }
    public boolean checkDivisibility(int n) {
        int s=0,p=1,dup=n;
        if(n==0)
        return true;
        while(n>0)
        {
            int rem=n%10;
            s+=rem;
            p*=rem;
            n/=10;
        }

        return (dup%(s+p))==0;
    }
}