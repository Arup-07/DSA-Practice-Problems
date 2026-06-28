/*leetCode 13:Roman To Integer
 Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.
Example 1:
Input: s = "III"
Output: 3
Explanation: III = 3. */


class q20 
{
    public static void main(String args[])
    {
        q20 ob = new q20();
        String s="MCMXCIV";
        System.out.println(ob.romanToInt(s));
    }
    public int romanToInt(String s) {
        int n=0;
        for(int i=0;i<s.length()-1;i++)
        {
            char c= s.charAt(i), d=s.charAt(i+1);
            int j=0,k=0;
            if(c=='I')
                j=1;
            else if(c=='V')
                j=5;
            else if(c=='X')
                j=10;
            else if(c=='L')
                j=50;
            else if(c=='C')
                j=100;
            else if(c=='D')
                j=500;
            else if(c=='M')
                j=1000;

            if(d=='I')
                k=1;
            else if(d=='V')
                k=5;
            else if(d=='X')
                k=10;
            else if(d=='L')
                k=50;
            else if(d=='C')
                k=100;
            else if(d=='D')
                k=500;
            else if(d=='M')
                k=1000;

            if(j>=k)
                n+=j;
            else if(j<k)
                n-=j;
        }
        char c=s.charAt(s.length()-1);
        if(c=='I')
                n+=1;
            else if(c=='V')
                n+=5;
            else if(c=='X')
                n+=10;
            else if(c=='L')
                n+=50;
            else if(c=='C')
                n+=100;
            else if(c=='D')
                n+=500;
            else if(c=='M')
                n+=1000;
        return n;
    }
}