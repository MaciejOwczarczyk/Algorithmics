package pl.coderslab.hackerRank.day_22.demo;

import java.util.LinkedList;
import java.util.Queue;

class Node {

    Node left,right;
    int data;

    Node(int data){
        this.data = data;
        left = right = null;
    }
}

class Solution {

    static Queue<Node> queue = new LinkedList<Node>();

    static void levelOrder(Node root){
        queue.add(root);

        while(!queue.isEmpty()) {
            Node current = queue.remove();
            System.out.print(current.data + " ");
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

    public static Node insert(Node root, int data){

        if(root == null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left,data);
                root.left = cur;
            }
            else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
        Node root = null;

        int[] arr = {3,5,2,1,4,6,7};

        for (Integer n : arr) {
            root = insert(root, n);
        }

//        while(T-->0){
//            int data = sc.nextInt();
//            root = insert(root, data);
//        }
        levelOrder(root);
    }
}