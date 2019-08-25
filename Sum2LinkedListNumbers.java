/**
 * You have two numbers represented by a linked list, where each node contains a sin-
 * gle digit. The digits are stored in reverse order, such that the 1’s digit is at the head of
 * the list. Write a function that adds the two numbers and returns the sum as a linked
 * list.
 * EXAMPLE
 * Input: (3 -> 1 -> 5) + (5 -> 9 -> 2)
 * Output: 8 -> 0 -> 8
 */

package main;

import java.util.LinkedList;

public class Sum2LinkedListNumbers {

    public static void main(String[] args) {

        // Sample 1
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        list1.add(5);
        list2.add(5); list2.add(1);
        System.out.println(list1  + " + " + list2);

        System.out.println(getSumListsNumber(list1, list2) + "\n");

        // Sample 2
        list1 = new LinkedList<>();
        list2 = new LinkedList<>();

        list1.add(3); list1.add(1); list1.add(5);
        list2.add(5); list2.add(9); list2.add(2);
        System.out.println(list1  + " + " + list2);

        System.out.println(getSumListsNumber(list1, list2) + "\n");

        // Sample 3
        list1 = new LinkedList<>();
        list2 = new LinkedList<>();

        list1.add(9); list1.add(9); list1.add(9);
        list2.add(9); list2.add(9); list2.add(9);
        System.out.println(list1  + " + " + list2);

        System.out.println(getSumListsNumber(list1, list2) + "\n");

    }

    private static LinkedList<Integer> getSumListsNumber(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> list3 = new LinkedList<>();
        int c1, c2, rest = 0;

        while (list1.peek() != null || list2.peek() != null) {
            c1 = (list1.peek() != null) ? list1.poll() : 0;
            c2 = (list2.peek() != null) ? list2.poll() : 0;

            int sum = c1 + c2 + rest;
            int value = sum;

            if (sum >= 10) {
                rest = 1;
                value = sum - 10;
            } else {
                rest = 0;
            }

            list3.add(value);
        }
        if (rest > 0) {
            list3.add(rest);
        }
        return list3;
    }
}