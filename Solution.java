package buoi5;

    class Node {
        int data;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }

    class Solution {
        Node reverseList(Node head) {
            // code here
            if (head == null) return head;
            Node current = head;
            Node next = null;
            Node prev = null;

            while (current != null){
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }

            return prev;
        }
    }

