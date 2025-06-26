package DoublyLinkedList;

public class DeleteAllOccurrences {
    public static DoublyLinkedListUtils.Node delete(DoublyLinkedListUtils.Node head, int key) {
        if (head == null) {
            return head;
        }
        DoublyLinkedListUtils.Node back = null;
        DoublyLinkedListUtils.Node temp = head;
        DoublyLinkedListUtils.Node front;
        while (temp != null) {
            front = temp.next;
            if (temp.data == key) {
                if (temp == head) {
                    head = front;
                    if (head != null) {
                        head.prev = null;
                    }
                    temp = head;
                } else {
                    if (back != null) {
                        back.next = front;

                    }
                    if (front != null) {
                        front.prev = back;
                    }
                }
            } else {
                back = temp;
            }
            temp = front;
        }
        return head;
    }
}
