package codingninja;

public class InsertionSortInList {
    class Node
    {

        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }


    public class Solution
    {
        public static Node insertionSortLL(Node head)
        {
            // Write your code here
            if (head == null || head.next == null) {
                return head; // Already sorted or empty list
            }

            Node sortedList = null;

            while (head != null) {
                Node current = head;
                head = head.next;

                if (sortedList == null || current.data < sortedList.data) {
                    current.next = sortedList;
                    sortedList = current;
                } else {
                    Node temp = sortedList;
                    while (temp.next != null && temp.next.data < current.data) {
                        temp = temp.next;
                    }
                    current.next = temp.next;
                    temp.next = current;
                }
            }

            return sortedList;
        }
    }
}
