/*LeetCode Problem: 989. Add to Array-Form of Integer
The problem "Add to Array-Form of Integer" on LeetCode asks you to add an integer k to an array-form integer num. The array-form integer is represented as an array of digits, where each digit is a separate element in the array. The most significant digit is at the beginning of the array, and the least significant digit is at the end.
To solve this problem, you need to iterate through the array from the least significant digit to the most significant digit, adding the corresponding digits of num and k. If the sum of the digits exceeds 9, you need to carry over the excess to the next digit. Finally, you should return the result as a list of integers representing the new array-form integer.
Example 1:
Input: num = [1,2,0,0], k = 34
Output: [1,2,3,4]*/

import java.util.*;
class q13 {
    public static void main(String[] args) {
        q13 obj = new q13();
        int[] num = {1, 2, 0, 0};
        int k = 34;
        System.out.println(obj.addToArrayForm(num, k)); // Output: [1, 2, 3, 4]
    }
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int i = num.length - 1;
        while(i >= 0 || k > 0) {
            if(i >= 0)
                k += num[i--];
            ans.add(k % 10);
            k /= 10;
        }
        Collections.reverse(ans);
        return ans;
    }
}