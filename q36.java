/*LeetCode 125: Valid Palindrome
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.
Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
*/




public class q36 {
    public static void main(String args[])
    {
        q36 ob= new q36();
        String  s = "A man, a plan, a canal: Panama";
        boolean ans=ob.isPalindrome(s);
        System.out.println(ans);
    }
    public boolean isPalindrome(String s) {
        if(s==" " || s.length()==1)
            return true;
        else
        {
            s=s.toLowerCase();
            int l=0,r=s.length()-1;
          
            while(l<r)
            {
                char c1=s.charAt(l),c2=s.charAt(r);
                if(!Character.isLetterOrDigit(c1))
                    l++;
                else if(!Character.isLetterOrDigit(c2))
                    r--;
                else if(c1!=c2)
                    return false;
                else
                {
                    l++;
                    r--;
                }
            }
            return true;
        }
    }
}