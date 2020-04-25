package pl.coderslab.hackerRank.day_15;

public class Node {

    private Node next;
    private int data;

    public Node(int newData) {
        this.next = null;
        this.data = newData;
    }

//    public Node(Node newNext, int newData) {
//        this.next = newNext;
//        this.data = newData;
//    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "next=" + next +
                ", data=" + data +
                '}';
    }
}
