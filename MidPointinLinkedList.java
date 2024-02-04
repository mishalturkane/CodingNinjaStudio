package codingninja;

import dsa.linkedlist.singlyl.Node;

public class MidPointinLinkedList {
    Node head;
    public Node findMid2() {
        if (head == null) {
            System.out.println("list is empty");
            return null;
        }
        Node start=head;
        Node end=head;
        Node prev=null;
        while (end != null && end.getNext() != null) {
            prev=start;
            start=start.getNext();
            end=end.getNext().getNext();

        }
        if(prev!=null){
            prev.setNext(null);
            return start;
        }
        else {
            return head;
        }
    }
}
