/*Leetcode 231: Power of Two
Given an integer n, return true if it is a power of two. Otherwise, return false
Example 1:
Input: n = 16
Output: true*/

public class q4 {
    public static void main(String[] args) {
        q4 obj=new q4();
        int n=16;
        System.out.println(obj.isPowerOfTwo(n));
    }
    public boolean isPowerOfTwo(int n) {
        if(n==1)
            return true;
        else if(n%2!=0 || n<1)
            return false;
        else
        {
            while(n%2==0){
                n/=2;
            }
            if(n==1)
              return true;
            else
              return false;
        }       
    }
}
