/*LeetCode 1108:Defanging an IP address
Given a valid (IPv4) IP address, return a defanged version of that IP address.
A defanged IP address replaces every period "." with "[.]".
Example 1:
Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
*/




import java.util.*;
class q66 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        q66 obj=new q66();
        System.out.println(obj.defangIPaddr(s));
    }
    public String defangIPaddr(String address) {
        return  address.replace(".","[.]");
    }
}