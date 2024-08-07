/*
Ignore this file as this is too high level for just the starters of DSA
*/

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode a = l1;
        ListNode b = l2;
        int carry = 0 ;

        ListNode head_Res = new ListNode();
        ListNode current = head_Res;

        while (a != null || b != null || carry != 0) {
            int p = (a != null) ? a.val : 0; 
            int q = (b != null) ? b.val : 0; 
            int sum = p + q + carry ;

            current.next = new ListNode(sum % 10) ;
            carry = sum / 10 ;

            if (a != null) a = a.next;
            if (b != null) b = b.next;

            current = current.next;
        }

        return head_Res.next;
    }
}

public class addTwoNumbersLL {
    public static void main(String[] args) {
        Solution c1 = new Solution();

        int[][] cases = {
            {2,4,3},
            {5,6,4},
            {0},
            {0},
            {9,9,9,9,9,9,9},
            {9,9,9,9}
        };

        for ( int i = 0 ; i < cases.length ; i+=2){
            ListNode l1 = createList(cases[i], cases[i].length);
            ListNode l2 = createList(cases[i + 1], cases[i+1].length);
            ListNode result = c1.addTwoNumbers(l1, l2);
            printList(result);
        }
    }

    public static void printList(ListNode l1){
        ListNode current = l1;
        System.out.print("[");
        while (current != null){
            System.out.print(current.val);
            current = current.next;
            if (current != null) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    static ListNode createList(int[] a, int n){
        if (n < 1) return null;

        ListNode head = new ListNode(a[0]);
        ListNode current = head;

        for (int i = 1; i < n; i++) {
            current.next = new ListNode(a[i]);
            current = current.next;
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}