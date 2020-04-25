package pl.coderslab.hackerRank.day_15;

public class LinkedListUS {

    private Node head;
    private int count;


    public LinkedListUS(Node newHead) {
        this.head = newHead;
        this.count = 1;
    }

    public void add(int newData) {
        Node temp = new Node(newData);
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(temp);
        count++;
    }

    public int get(int index) {
        if (index <= 0) {
            return -1;
        }
        Node current  = head;
        for (int i = 1; i < index ; i++) {
            current = current.getNext();
        }

        return current.getData();
    }

    public int size() {
        return this.count;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void remove() {
        //remove from the back on the list
        Node current = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);
        count--;
    }


    public static void main(String[] args) {
        Node node = new Node(12);
        System.out.println(node.getNext() + " " + node.getData());
        LinkedListUS linkedListUS = new LinkedListUS(node);
        linkedListUS.add(45);
        System.out.println(node.toString());
        linkedListUS.add(39);
        System.out.println(node.getNext().getNext() + " " + node.getData());
        linkedListUS.add(12);
        System.out.println(node.getNext().getNext() + " " + node.getData());

    }
}
