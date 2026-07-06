/*LeetCode 58: Length of Last Word
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.
Example 1:
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
*/



class q31 {
    public static void main(String args[]) {
        q31 obj = new q31();
        String s = "Hello World";
        System.out.println(obj.lengthOfLastWord(s));
    }
    public int lengthOfLastWord(String s) {
        // String a[]=s.split(" ");
        // return a[a.length-1].length();
        s=s.trim();
        int a=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            char c=s.charAt(i);
            if(c!=32)
             a++;
            else
                break;

        }
        return a;
    }
}