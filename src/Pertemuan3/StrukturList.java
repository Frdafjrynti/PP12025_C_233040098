package Pertemuan3;

public class StrukturList {
    private Node head;

    public boolean isEmpty() {
        return head == null;
    }

    // addTail
    public void addTail(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    // displayElement
    public void displayElement() {
        Node current = head;
        System.out.print("Elemen: ");
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    // addHead
    public void addHead(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }
}
