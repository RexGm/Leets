/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode list = new ListNode(0);
    ListNode head = list;
    int carry = 0, sum = 0;
    String result = "";

    while (true) {
        
        if(l1 != null){
            sum+= l1.val;
            l1 = l1.next;
        }
        if(l2 != null){
            sum+=l2.val;
            l2 = l2.next;
        }
        sum+=carry;
         

        if(sum > 9){
            
            carry = sum/10;
            sum%=10;
            result+=sum;
            sum = 0;
        }else{
            result+=sum;
            carry = 0;
            sum = 0;
        }       if(l1 == null && l2 == null){
                if(carry != 0){result += carry;}
                
                break;
            }
    }
    for (int i = 0 ; i < result.length() ; i++ ) {

            head.next = new ListNode(Integer.parseInt(result.charAt(i)+""));
            head = head.next;
        }
    
    return list.next;  

    }

    
}