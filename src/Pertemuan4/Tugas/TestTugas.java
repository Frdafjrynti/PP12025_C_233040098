package Pertemuan4.Tugas;

public class TestTugas {
    public static void main(String[] args) {
        StrukturListTugas listA = new StrukturListTugas();
        StrukturListTugas listB = new StrukturListTugas();

        //a. 2.1 3.4 4.5
        System.out.println("Output a: ");
        listA.addHead(2.1); // awal
        listA.addMid(3.4, 2); // tengah
        listA.addTail(4.5); // akhir
        listA.displayElement();

        //b. 3.4 2.1 1.1 4.5 5.5
        System.out.println("\nOutput b: ");
        listB.addHead(3.4); // awal

        // akhir
        listB.addTail(4.5);
        listB.addTail(5.5);

        // tengah
        listB.addMid(2.1, 2); // menambahkan 2.1 diindex 2
        listB.addMid(1.1, 3); //menambahkan 1.1 diindex 3
        listB.displayElement();
    }
}
