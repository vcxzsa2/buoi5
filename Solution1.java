package buoi5;

public class Solution1 {
    class Node {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }


    class Solution {
        // Function to remove duplicates from sorted linked list.
        Node removeDuplicates(Node head) {
            // Your code here

            if (head == null || head.next == null) return head;

            Node current = head;

            while (current != null && current.next != null){

                // Nếu node hiện tại và node kế tiếp có cùng giá trị
                if (current.data == current.next.data){

                    // Bỏ qua node kế tiếp neeus trùng lặp
                    current.next = current.next.next;

                    // Nếu không trùng thì tiếp tục duyệt
                } else {

                    current = current.next;
                }
            }
            return head;
        }
    }
}
