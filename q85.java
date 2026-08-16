/*LeetCode 205: Isomorphic Strings
Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

Example 1:
Input: s = "egg", t = "add"
Output: true
*/


import java.util.*;
class q85{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        q85 obj=new q85();
        String s=sc.nextLine();
        String t=sc.nextLine();
        boolean res=obj.isIsomorphic(s,t);
        System.out.println(res);
    }
    public boolean isIsomorphic(String s, String t) {
        int[] sm=new int[256];
        int[] tm=new int[256];
        for(int i =0;i<s.length();i++)
        {
            char a=s.charAt(i);
            char b=t.charAt(i);
            if(sm[a]!=tm[b])
                return false;
            sm[a]=i+1;
            tm[b]=i+1;
        }
        return true;
    }
}