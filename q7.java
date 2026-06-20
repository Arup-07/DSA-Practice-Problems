/*LeetCode 929: Unique Email Addresses
The problem "Unique Email Addresses" on LeetCode asks you to determine how many unique email addresses there are in a given list of email addresses. An email address consists of a local name and a domain name, separated by the '@' symbol. The rules for processing the local name are as follows:1. Ignore any characters after a '+' in the local name.
2. Remove all '.' characters from the local name.
The domain name remains unchanged. After processing the email addresses according to these rules, you need to return the count of unique email addresses.
Example 1:
Input: emails = ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
Output: 2*/

import java.util.HashSet;
class q7 {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set= new HashSet<>();
        // for(int i=0;i<emails.length;i++)
        // {
        //     String a="";
        //     boolean p=false;
        //     for(int j=0;j<emails[i].length();j++)
        //     {
        //         char c=emails[i].charAt(j);
        //         if(c!='+' && p==false)
        //         {
        //             if(c>='a' && c<='z')
        //                 a+=c;
        //            else if(c=='.')
        //                 continue;
        //             else
        //            {    a+=emails[i].substring(j);
        //                break;}
        //         }                  
        //         else if(c=='+' || p==true)
        //         {
        //             p=true;
        //             if(c=='@')
        //             {
        //                 p=false;
        //                 a=a+emails[i].substring(j);
        //                 break;
        //             }
        //         }
        //     }
        //     set.add(a);
        // }
        

        for(int i=0;i<emails.length;i++)
        {
            String a="";
                if(emails[i].indexOf('+')!=-1)
                    emails[i]=emails[i].substring(0,emails[i].indexOf('+'))+emails[i].substring(emails[i].indexOf('@'));
                if(emails[i].indexOf('.')!=-1 && (emails[i].indexOf('.')<emails[i].indexOf('@')))
                {
                    for(int j=0;j<emails[i].length();j++)
                    {
                        char c=emails[i].charAt(j);
                        if(c=='@')
                          break;
                        else
                        {
                            if(c>='a' && c<='z')
                                    a+=c;
                            else if(c=='.')
                                    continue;
                        }
                    }
                    emails[i]=a+emails[i].substring(emails[i].indexOf('@'));
                }

            set.add(emails[i]);
        }
        return set.size();   
    }
}