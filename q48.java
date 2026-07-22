/*LeetCode 387:First Unique Character in a String
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
Example 1:
Input: s = "leetcode"
Output: 0 */




import java.util.*;
class q48 {
    public static void main(String[] args) {
        q48 obj = new q48();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(obj.firstUniqChar(s));
    }
    public int firstUniqChar(String s) {
        int n=s.length();
        int[] freq=new int[26];
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<n;i++){
            if(freq[s.charAt(i)-'a']==1)
            {
                return i;
            }
        }
        return -1;
        
    }
}