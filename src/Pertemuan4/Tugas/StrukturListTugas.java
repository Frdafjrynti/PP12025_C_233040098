package Pertemuan4.Tugas;

public class StrukturListTugas {
    NodeTugas head;
//    int position;

    public StrukturListTugas() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    // addTail (tambah data diakhir)
    public void addTail(double data) {
        NodeTugas newNode = new NodeTugas(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            NodeTugas posNode = null;
            NodeTugas curNode = head;

            while(curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(newNode);
        }
    }

    // addHead (tambah data diawal)
    public void addHead(double data) {
        NodeTugas newNode = new NodeTugas(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }

    // addMind
    // menambah data ditengah list
    public void addMid(double data, int position) {
        NodeTugas curNode;
        NodeTugas newNode = new NodeTugas(data);
        if(isEmpty()) {
            head = newNode;
        }else {
            curNode = head;
            if(position == 1) {
                newNode.setNext(curNode);
                head = newNode;
            }else {
                int i =1;
                while(i < position -1 && curNode.getNext() != null) {
                    curNode = curNode.getNext();
                    i++;
                }
                newNode.setNext(curNode.getNext());
                curNode.setNext(newNode);
            }
        }

    }

    // displayElement
    public void displayElement() {
        NodeTugas current = head;
//        System.out.print("Elemen: ");
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}
