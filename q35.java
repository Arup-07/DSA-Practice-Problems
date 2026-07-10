/*LeetCode 67: Add Binary
Given two binary strings a and b, return their sum as a binary string.
Example 1:
Input: a = "11", b = "1"
Output: "100"
*/


class q35 {
    public static void main(String[] args) {
        q35 obj = new q35();
        String a = "1010";
        String b = "1011";
        String result = obj.addBinary(a, b);
        System.out.println("The sum of binary numbers " + a + " and " + b + " is: " + result);
    }
    public String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        StringBuilder sb= new StringBuilder();
        while(i>=0 || j>=0 || carry!=0)
        {
            int sum=carry;
            if(i>=0)
                sum+=a.charAt(i--)-'0';
            if(j>=0)
                sum+=b.charAt(j--)-'0';
            sb.append(sum%2);
            carry=sum/2;
        }
        return sb.reverse().toString();
    }
}