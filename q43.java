/*LeetCode 242:Valid Anagram
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
*/





import java.util.HashMap;
public class q43 {
    public static void main(String[] args) {
        q43 obj = new q43();
        String s = "anagram";
        String t = "nagaram";
        System.out.println(obj.isAnagram(s,t));
    }
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray())
            map.put(c,map.getOrDefault(c,0)+1);
        for(char c : t.toCharArray()){
    if(!map.containsKey(c))
        return false;
    map.put(c,map.get(c)-1);
    if(map.get(c)==0)
        map.remove(c);
}

return map.isEmpty();   
    }

}
