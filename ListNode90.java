/*LeetCode 21:Merge Two Sorted Lists
You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.
*/
/**
 * Definition for singly-linked list.*/
  public class ListNode90 {
      int val;
      ListNode90 next;
      ListNode90() {}
      ListNode90(int val) { this.val = val; }
      ListNode90(int val, ListNode90 next) { this.val = val; this.next = next; }
}
class q90 {
    public static void main(String[] args) {
        ListNode90 l1=new ListNode90(1);
        l1.next=new ListNode90(2);
        l1.next.next=new ListNode90(4);
        ListNode90 l2=new ListNode90(1);
        l2.next=new ListNode90(3);
        l2.next.next=new ListNode90(4);
        q90 obj=new q90();
        ListNode90 ans=obj.mergeTwoLists(l1,l2);
        while(ans!=null)
        {
            System.out.print(ans.val+" ");
            ans=ans.next;
        }
    }
    public ListNode90 mergeTwoLists(ListNode90 list1, ListNode90 list2) {
        ListNode90 p = new ListNode90(0);
        ListNode90 curr=p;
        while(list1!=null && list2!=null)
        {
            if(list1.val<=list2.val)
            {
                curr.next=list1;
                list1=list1.next;
            }
            else
            {
                curr.next=list2;
                list2=list2.next;
            }
            curr=curr.next;
        }
        if (list1 != null)
            curr.next = list1;
        else
            curr.next = list2;
        return p.next;
    }
}
