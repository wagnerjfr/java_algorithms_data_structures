/**
 * Given a singly Linked List, write a function to find the nth-to-last
 * element of the list.
 *
 * EXAMPLE:
 * list = 1 -> 2 -> 3 -> 4 -> 5 -> null
 *
 * n = 1; output = 4;
 * n = 2; output = 3;
 * n = 3; output = 2;
 */

package main;

public class Nth2LastElementLinkedList {

    public static void main(String[] args) {
        Node node5 = new Node(5, null);
        Node node4 = new Node(4, node5);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);

        System.out.println(getNthToLast(1, node1).value);
        System.out.println(getNthToLast(2, node1).value);
        System.out.println(getNthToLast(3, node1).value);
    }

    private static Node getNthToLast(int n, Node root) {
        Node current = root, follower = root;

        for (int i = 0; i < n; i++) {
            if (current.next == null)
                return null;
            current = current.next;
        }

        while (current.next != null) {
            current = current.next;
            follower = follower.next;
        }

        return follower;
    }

    private static class Node {
        private int value;
        private Node next;

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public String toString() {
            return value + " -> " + next.value;
        }
    }
}
