class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy =new ListNode(0);
        ListNode curr =dummy;
        while(list1!=null && list2!=null){
            //merge sort
            if(list1.val<=list2.val){
                curr.next=list1;
                list1=list1.next;
            }
            else{
                curr.next =list2;
                list2=list2.next;
            }
            curr=curr.next;
        }
        curr.next=list1!=null ? list1 : list2;
        return dummy.next;
    }
}
//time complexity =0(n)
// space complexity =0(1)