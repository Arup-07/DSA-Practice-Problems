/*Leetcode 14. Longest Common Prefix
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"
 */

class q24 {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        q24 obj = new q24();
        String result = obj.longestCommonPrefix(strs);
        System.out.println(result);
    }
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0)
            return "";
        String p=strs[0];
        for(int i=1;i<strs.length;i++)
            while(strs[i].indexOf(p)!=0)
            {    p=p.substring(0,p.length()-1);
                if(p.isEmpty())
                    return "";
            }
        return p;
    }
}
