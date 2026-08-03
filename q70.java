/*LeetCode 50: Pow(x,n)
Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
Example 1:
Input: x = 2.00000, n = 10
Output: 1024.00000
*/




import java.util.*;
class q70 {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
        q70 obj = new q70();
        double result = obj.myPow(x,n);
        System.out.println(result);
    }
    public double myPow(double x, int n) {
        return Math.pow(x,n);
    }
}