/*LeetCode 3014:Minimum Number Of Pushes to Type Word 1
You are given a string word containing distinct lowercase English letters.
Telephone keypads have keys mapped with distinct collections of lowercase English letters, which can be used to form words by pushing them. For example, the key 2 is mapped with ["a","b","c"], we need to push the key one time to type "a", two times to type "b", and three times to type "c" .
It is allowed to remap the keys numbered 2 to 9 to distinct collections of letters. The keys can be remapped to any amount of letters, but each letter must be mapped to exactly one key. You need to find the minimum number of times the keys will be pushed to type the string word.
Return the minimum number of pushes needed to type word after remapping the keys.
An example mapping of letters to keys on a telephone keypad is given below. Note that 1, *, #, and 0 do not map to any letters.
Example 1:
Input: word = "abcde"
Output: 5*/



import java.util.*;
class q58 {
    public static void main(String[] args) {
        q58 obj = new q58();
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        System.out.println(obj.minimumPushes(word));
    }
    public int minimumPushes(String word) {
        int r=0;
        for(int i=0;i<word.length();i++)
            r+=(i/8)+1;
        return r;
    }
}