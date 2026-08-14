/*LeetCode 3090: Maximum Length Substring with Two Occurances
Given a string s, return the maximum length of a substring such that it contains at most two occurrences of each character.
Example 1:
Input: s = "bcbbbcba"
Output: 4
*/


import java.util.*;
class q83 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        q83 obj=new q83();
        String s=sc.next();
        int res=obj.maximumLengthSubstring(s);
        System.out.println(res);
    }
    public int maximumLengthSubstring(String s) {
        HashMap<Character, Integer> map= new HashMap<>();
        int left=0,max=0;
        for(int right=0;right<s.length();right++)
        {
            char c=s.charAt(right);
            map.put(c,map.getOrDefault(c,0)+1);
            while (map.get(c) > 2) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);

                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
        
    }
}