/*LeetCode  118: Pascal's Trainagle
Given an integer numRows, return the first numRows of Pascal's triangle.
Example 1:
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
*/



import java.util.*;
class q86 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans= new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            List<Integer> row= new ArrayList<>();
            row.add(1);
            for(int j=1;j<i;j++)
                row.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
        
        if(i>0)
            row.add(1);
        ans.add(row);
        }
            return ans;

    }
}