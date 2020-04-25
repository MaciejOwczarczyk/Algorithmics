package pl.coderslab.hackerRank.day_15.demo;

import pl.coderslab.hackerRank.day_15.demo.Node2;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node2 head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = Node2.insert(head,ele);
        }
        Node2.display(head);
        sc.close();
    }
}
