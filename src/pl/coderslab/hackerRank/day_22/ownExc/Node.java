package pl.coderslab.hackerRank.day_22.ownExc;

class Node {

    Node left;
    Node right;
    int data;

    public Node(int data) {
        this.left = null;
        this.right = null;
        this.data = data;
    }
}

class Solution {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt();
        Node root = null;

//        while (t --> 0) {
//            int data = scanner.nextInt();
//            root = insert(root, data);
//        }

        int[] arr = {4, 6, 2};

        for (Integer n : arr) {
            root = insert(root, n);
        }
    }

    private static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node current;
            if (data <= root.data) {
                current = insert(root.left, data);
                root.left = current;
            } else {
                current = insert(root.right, data);
                root.right = current;
            }
            return root;
        }


    }
}
