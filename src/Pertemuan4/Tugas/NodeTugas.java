package Pertemuan4.Tugas;

public class NodeTugas {
     double data;
     NodeTugas next;

    public NodeTugas(double data) {
        this.data = data;
        this.next = null;
    }
    public double getData() {
        return data;
    }
    public void setData(double data) {
        this.data = data;
    }
    public NodeTugas getNext() {
        return next;
    }
    public void setNext(NodeTugas next) {
        this.next = next;
    }
}
