/*LeetCode 344: Reverse String
Write a function that reverses a string. The input string is given as an array of characters s.
You must do this by modifying the input array in-place with O(1) extra memory.  
Example 1:
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]*/


public class q19{
    public static void main(String args[])
    {
        q19 ob = new q19();
        char n[]={'h','e','l','l','o'};
        ob.reverseString(n);
    }
    public void reverseString(char[] s) {
        int i=0, j=s.length-1;
        while(i<j)
        {
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;j--;
        }
        for(char a:s)
            System.out.print(a +" ");
    }
} 