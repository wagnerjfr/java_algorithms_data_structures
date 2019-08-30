/**
 * Given a binary search tree, design an algorithm which creates a linked list of all the
 * nodes at each depth (i.e., if you have a tree with depth D, you’ll have D linked lists)
 *
 * EXAMPLE:
 *          10
 *         /  \
 *        5    15
 *      /  \    \
 *     1   8    20
 *          \
 *           9
 *
 * LinkedList1: 10, 5, 1
 * LinkedList2: 10, 5, 8, 9
 * LinkedList3: 10, 15, 20
 */

package main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListsOfBinaryTreeDepthPaths {

    private static List<LinkedList<Integer>> linkedListList = new ArrayList<>();

    public static void main(String[] args) {
        Node root = new Node(10);
        root.add(5);
        root.add(15);
        root.add(1);
        root.add(8);
        root.add(20);
        root.add(9);
        //print(root);

        LinkedList<Integer> list = new LinkedList<>();
        createLinkedLists(root, list);
        System.out.println(linkedListList);
    }

    private static void createLinkedLists(Node node, LinkedList<Integer> list) {
        if (node != null) {
            list.add(node.data);
            if (node.left == null && node.right == null) {
                linkedListList.add(new LinkedList<>(list));
            } else {
                createLinkedLists(node.left, list);
                createLinkedLists(node.right, list);
            }
            list.removeLast();
        }
    }

    private static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }

        public void add(int d) {
            add(this, d);
        }

        private void add(Node node, int d) {
            if (node.data > d) {
                if (node.left == null)
                    node.left = new Node(d);
                else
                    add(node.left, d);
            } else {
                if (node.right == null)
                    node.right = new Node(d);
                else
                    add(node.right, d);
            }
        }
    }

    static void print(Node node) {
        System.out.println(node.data);
        if (node.left != null) {
            print(node.left);
        }
        if (node.right != null) {
            print(node.right);
        }
    }
}
