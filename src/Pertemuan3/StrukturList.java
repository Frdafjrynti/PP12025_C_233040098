package Pertemuan3;

public class StrukturList {
    Node head;
//    int position;

    public StrukturList() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    // addTail (tambah data diakhir)
    public void addTail(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node posNode = null; //menyimpan node sebelumnya saat looping
            Node curNode = head; //variable untuk looping, dimulai dari node pertama

            while(curNode != null) {
                posNode = curNode; //menyimpan node saat ini sebagai node sebelumnya. contoh list 1 -> 2 -> 3, misal node
                // yang ada cuman 1 -> 2, trus mau nambah node list baru ->3, nah, pos node nya itu 2, yang berubah jadi current node. setelah itu
                curNode = curNode.getNext(); //node gerak ke node berikutnya menggunakan getter si current node yang di
                // contoh itu nilainya 2, bakal gerak ke 3 dan si 3 bakal jadi pos node dan cur node selama belum ada node baru lagi
            }
            posNode.setNext(newNode); // menambah node baru setelah node terakhir dengan setter
        }
    }

    // addHead (tambah data diawal)
    public void addHead(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }

    // addMind
    // menambah data ditengah list
    public void addMid(int data, int position) {
        Node curNode;
        Node newNode = new Node(data);
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
        Node current = head;
        System.out.print("Elemen: ");
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}
