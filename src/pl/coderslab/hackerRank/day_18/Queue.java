package pl.coderslab.hackerRank.day_18;

import java.util.LinkedList;
import java.util.Stack;

public class Queue {
    private LinkedList queue;

    public Queue() {
        queue = new LinkedList();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public void enqueue(String n ){
        queue.addLast(n);
    }

    public String dequeue() {
       return (String) queue.remove(0);
    }

    public String peak() {
        return (String) queue.get(0);

    }

    @Override
    public String toString() {
        return "Queue{" +
                "queue=" + queue +
                '}';
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        Stack<String> stack = new Stack<>();
        stack.push("Hi");
        stack.push("There");
        System.out.print(stack.pop() + " ");
        System.out.println(stack.pop() + ".");



        Queue stringQueque = new Queue();
        stringQueque.enqueue("hi");
        stringQueque.enqueue("there");
        System.out.print(stringQueque.dequeue() + " ");
        System.out.println(stringQueque.dequeue() + ". ");

    }
}
