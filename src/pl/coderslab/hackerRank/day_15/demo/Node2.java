package pl.coderslab.hackerRank.day_15.demo;

public class Node2 {

    int data;
    Node2 next;

    public Node2(int d) {
        data = d;
        next = null;
    }

    public static Node2 insert(Node2 head, int data) {
        if (head == null) {
            return new Node2(data);
        }

        Node2 tmp = head;
        while (tmp.next != null) {
           tmp = tmp.next;
        }
        tmp.next = new Node2(data);
        return head;
    }

    public static void display(Node2 head) {
        Node2 start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

}
