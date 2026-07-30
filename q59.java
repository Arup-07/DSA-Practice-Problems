/*LeetCode 1967: Number Of Strings that Appear as Substrings in Word
Given an array of strings patterns and a string word, return the number of strings in patterns that exist as a substring in word.
A substring is a contiguous sequence of characters within a string.
Example 1:
Input: patterns = ["a","abc","bc","d"], word = "abc"
Output: 3
*/

import java.util.*;
public class q59 {
    public static void main(String[] args) {
        q59 obj = new q59();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] patterns = new String[n];
        for(int i=0;i<n;i++)
            patterns[i] = sc.next();
        String word = sc.next();
        System.out.println(obj.numOfStrings(patterns, word));
    }
    public int numOfStrings(String[] patterns, String word) {
        int c=0;
        for(int i=0;i<patterns.length;i++)
        {
             if(word.indexOf(patterns[i])!=-1)
                c++;
        }
        return c;
    }
} 
