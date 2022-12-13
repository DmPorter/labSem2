package lab5.smth2;

import java.util.*;

//TL done
public class Solution3 {
    static Node root;
    static HashMap<Integer, Node> mapNodes;

    public static void main(String[] args) {
        root = new Node(1);
        mapNodes = new HashMap<>();
        mapNodes.put(1, root);
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (N > 1) {
            create(N - 1);
        }
        int Q = scanner.nextInt();
        for (int i = 0; i < Q; i++) {
            change(scanner.nextInt());
        }
        System.out.println(root);
    }

    private static void create(int N) {
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        while (true) {
            Node node = queue.remove();
            Node leftNode = new Node(node.value * 2, node);
            node.left = leftNode;
            mapNodes.put(leftNode.value, leftNode);
            if (--N == 0) {
                break;
            }
            Node rightNode = new Node(node.value * 2 + 1, node);
            node.right = rightNode;
            mapNodes.put(rightNode.value, rightNode);
            if (--N == 0) {
                break;
            }
            queue.add(node.left);
            queue.add(node.right);
        }
    }

    private static void change(int numberForChange) {
        Node curr = mapNodes.get(numberForChange);
        Node parent = curr.parent;
        if (parent != null) {
            Node pp = parent.parent;
            curr.parent = pp;
            parent.parent = curr;
            if (parent.left.equals(curr)) {
                leftChange(curr, parent);
            } else {
                rightChange(curr, parent);
            }
            if (pp == null) {
                root = curr;
            } else {
                if (pp.left.equals(parent)) {
                    pp.left = curr;
                } else {
                    pp.right = curr;
                }
            }
        }
    }

    private static void leftChange(Node curr, Node parent) {
        Node currL = curr.left;
        curr.left = parent;
        parent.left = currL;
        if (currL != null)
            currL.parent = parent;
    }

    private static void rightChange(Node curr, Node parent) {
        Node currR = curr.right;
        curr.right = parent;
        parent.right = currR;
        if (currR != null)
            currR.parent = parent;
    }

    static class Node {
        Node parent;
        Node left;
        Node right;
        int value;

        Node(int value) {
            this.value = value;
        }

        Node(int value, Node parent) {
            this(value);
            this.parent = parent;
        }

        @Override
        public boolean equals(Object obj) {
            return value == ((Node) obj).value;
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(value);
        }

        @Override
        public String toString() {
            return (left == null ? "" : left + " ")
                    + value
                    + (right == null ? "" : " " + right);
        }
    }
}
