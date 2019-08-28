/**
 * Given a sorted (increasing order) array, write an algorithm to create a binary tree with
 * minimal height.
 *
 * EXAMPLE:
 * [1,2,3,4,5,6,7] -> {4,2,1,3,6,5,7}
 *
 *          4
 *         / \
 *       2    6
 *      / \  / \
 *     1  3 5  7
 */

package main;

public class BinaryTreeFromSortedArray {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        Node<Integer> root = createTree(array, 0, array.length-1);
        printTree(root);
    }

    private static Node<Integer> createTree(int[] array, int min, int max) {
        Node<Integer> node = null;
        if (min < max) {
            int half = (max + min) / 2;
            node = new Node<>(array[half]);
            node.left = createTree(array, min, half-1);
            node.right = createTree(array, half+1, max);
        } else if (min == max) {
            node = new Node(array[min]);
        }
        return node;
    }

    private static void printTree(Node node) {
        System.out.print(node.data + ",");
        if (node.left != null) {
            printTree(node.left);
        }
        if (node.right != null) {
            printTree(node.right);
        }
    }

    private static class Node<E> {
        E data;
        Node<E> right, left;

        Node(E data) {
            this.data = data;
        }
    }
}
