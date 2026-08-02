/*LeetCode 3:Longest Substring without repeating Charcters
Given a string s, find the length of the longest substring without duplicate characters.
Example 1:
Input: s = "abcabcbb"
Output: 3
*/





import java.util.*;
public class q69{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        q69 obj = new q69();
        int result = obj.lengthOfLongestSubstring(s);
        System.out.println(result);
    }
    public int lengthOfLongestSubstring(String s) {
       HashSet<Character> set =  new HashSet<>();
       int l=0,max=0;
       for(int r=0;r<s.length();r++)
       {
            while(set.contains(s.charAt(r)))
            {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            max=Math.max(max,r-l+1);
       }
       return max;
    }
} 
