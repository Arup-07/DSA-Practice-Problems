/*Sum Of Digits using Recursion*/


import java.util.*;
public class q49 {
    public static void main(String[] args) {
        q49 obj = new q49();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(obj.sumOfDigits(n));
    }
    public int sumOfDigits(int n) {
        if(n==0)
            return 0;
        else
            return n%10 + sumOfDigits(n/10);
    }
    
}
