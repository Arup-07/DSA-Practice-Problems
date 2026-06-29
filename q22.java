


import java.util.*;
class q22 {
    public static void main(String[] args) {
        q22 obj = new q22();
        String s = "leet**cod*e";
        System.out.println(obj.removeStars(s));
    }
    public String removeStars(String s) {

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if(c == '*')
                sb.deleteCharAt(sb.length() - 1);
            else
                sb.append(c);
        }
        return sb.toString();
    }
}