/*Leetcode 52: Detect Capital
We define the usage of capitals in a word to be right when one of the following cases holds:
All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.
Example 1:
Input: word = "FlaG"
Output: false
*/




class q40 
{
    public static void main(String args[])
    {
        q40 ob = new q40();
        String word = "FlaG";
        boolean result = ob.detectCapitalUse(word);
        System.out.println(result);
    }
    public boolean detectCapitalUse(String word) {
        boolean res=false;
        if(word.equals(word.toUpperCase()) || word.equals(word.toLowerCase()))
            return true;
        else 
        {
            for(int i=1;i<word.length();i++)
            {
                char c=word.charAt(i);
                if(c>=65 && c<=90 )
                    return false;
           }
            return true;
        }
    }
}