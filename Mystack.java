package buoi5;

    class MyStack {
         class StackNode {
             int data;
             StackNode next;
             StackNode(int a) {
                 data = a;
                 next = null;
             }
         }
        StackNode top;

        // Function to push an integer into the stack.
        void push(int a) {
            // Add your code here
            StackNode newNode = new StackNode(a); // tạo node mới
            newNode.next = top; // liên kết node mới tới node hiện tại đang trên cùng
            top = newNode; // cập nhật top

        }

        // Function to remove an item from top of the stack.
        int pop() {
            // Add your code here
            if (top == null) {
                return -1; // stack rỗng
            }
            int popped = top.data; // lấy dữ liệu ở node trên cùng
            top = top.next; // cập nhật top sang node tiếp theo
            return popped;
        }
    }
