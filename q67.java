/*LeetCode 338: Counting bits
Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
Do not solve it with built-in functions (i.e., like __builtin_popcount in C++).
Example 1:
Input: n = 2
Output: [0,1,1]
*/





import java.util.*;
class q67 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        q67 obj=new q67();
        System.out.println(Arrays.toString(obj.countBits(n)));
    }
    public int[] countBits(int n) {
        int arr[] = new int[n+1];
        arr[0]=0;
        for(int i=1;i<=n;i++)
        {
            arr[i]= arr[i/2]+(i%2);
        }
        return arr;
    }
}