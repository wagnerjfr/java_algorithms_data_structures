/**
 * Implement a data structure SetOfStacks that should be composed of several stacks,
 * and should create a new stack once the previous one exceeds capacity. SetOfStacks.push() and SetOfStacks.pop()
 * should behave identically to a single stack (that is, pop() should return the same values as it would if there
 * were just a single stack).
 *
 * Implement a function popAt(int index) which performs a pop operation on a specific sub-stack.
 */

package main;

import java.util.*;

public class SetOfStacks<E> {

    private List<Stack<E>> stackList = new ArrayList<>();
    private final int THRESHOLD = 3;
    private Stack<E> current;

    public static void main(String[] args) {

        SetOfStacks<Integer> setOfStacks = new SetOfStacks<>();

        setOfStacks.push(1)
            .push(2)
            .push(3)
            .push(4)
            .push(5)
            .push(6)
            .push(7)
            .push(8);

        System.out.println(setOfStacks.toString());

        System.out.println(setOfStacks.popAt(0));
        System.out.println(setOfStacks.toString());

        System.out.println(setOfStacks.popAt(3));
        System.out.println(setOfStacks.toString());

        System.out.println(setOfStacks.popAt(1));
        System.out.println(setOfStacks.toString());

        setOfStacks.push(9)
            .push(10)
            .push(11);
        System.out.println(setOfStacks.toString());

        System.out.println(setOfStacks.pop());
        System.out.println(setOfStacks.pop());
        System.out.println(setOfStacks.pop());
        System.out.println(setOfStacks.pop());
        System.out.println(setOfStacks.toString());

        setOfStacks.push(13);
        System.out.println(setOfStacks.toString());

    }

    public SetOfStacks push(E e) {
        if (stackList.isEmpty() || current.size() == THRESHOLD) {
            Stack<E> stack = new Stack<>();
            stackList.add(stack);
            current = stack;
        }
        current.push(e);
        return this;
    }

    public E pop() {
        if (stackList.isEmpty()) {
            return null;
        } else if (current.size() == 1) {
            E value = current.pop();
            stackList.remove(current);
            current = stackList.get(stackList.size()-1);
            return value;
        } else {
            return current.pop();
        }
    }

    public E popAt(int index) {
        if (index < 0 || index > stackList.size()-1) {
            return null;
        }
        return stackList.get(index).pop();
    }

    public String toString() {
        return stackList.toString();
    }
}
