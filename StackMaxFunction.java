package main.datastructure;

/**
 * Design a stack with a push, pop and max function which returns the max value in the stack,
 * all of which are run in O(1) time.
 */
public class StackMaxFunction {

    public static void main(String args[]) {
        MaxStack maxStack = new MaxStack();
        maxStack.push(10);
        maxStack.push(30);
        maxStack.push(20);
        System.out.println("print: max value: " + maxStack.max());
        maxStack.push(10);
        System.out.println("print: max value: " + maxStack.max());
        System.out.println("print: pop: " + maxStack.pop());
        System.out.println("print: pop: " + maxStack.pop());
        System.out.println("print: max value: " + maxStack.max());
        maxStack.push(40);
        System.out.println("print: max value: " + maxStack.max());
    }

    private static class MaxStack {
        private Node root = null;

        private class Node {
            int value;
            int max;
            Node next;

            Node(int value, int max, Node next) {
                this.value = value;
                this.max = max;
                this.next = next;
            }

            private int getMax() {
                return this.max;
            }

            private Node getNext() {
                return this.next;
            }

            private void setNext(Node node) {
                this.next = node;
            }

            private int getValue() {
                return this.value;
            }

            @Override
            public String toString() {
                return this.getNext() + " -> " + this.getValue() + " [" + this.getMax() + "]";
            }
        }

        private void push(int value) {
            if (root == null) {
                root = new Node(value, value, null);
            } else {
                int rootMax = root.getMax();
                int newMax = (rootMax > value) ? rootMax : value;
                root = new Node(value, newMax, root);
            }
            System.out.println(this.toString());
        }

        private int pop() {
            if (root != null) {
                int value = root.getValue();
                Node nextRoot = root.getNext();
                root.setNext(null);
                root = nextRoot;
                System.out.println(this.toString());
                return value;
            }
            throw new UnsupportedOperationException("Stack is empty");
        }

        private int max() {
            return root.getMax();
        }

        @Override
        public String toString() {
            return this.root.toString();
        }
    }
}
