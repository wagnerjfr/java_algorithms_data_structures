package main.datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * A sample class of removing duplicated items from a using "generic" ArrayList
 */
public class GenericArrayListDuplicate {

    public static void main(String args[]) {
        List<String> listFruits = Arrays.asList("apple", "orange", "apple", "orange", "lemon", "banana");
        List<Integer> listNumbers = Arrays.asList(10, 20, 30, 10, 30, 50, 50);

        System.out.println(listFruits);
        System.out.println(removeDuplicates(listFruits));
        System.out.println(removeDuplicates2(listFruits));

        System.out.println(listNumbers);
        System.out.println(removeDuplicates(listNumbers));
        System.out.println(removeDuplicates2(listNumbers));
    }

    public static <E> List<E> removeDuplicates(List<E> list) {
        ArrayList<E> newList = new ArrayList<>();
        if (list.isEmpty()) {
            return newList;
        }
        LinkedHashSet<E> set = new LinkedHashSet<>();
        for (E e : list) {
            set.add(e);
        }
        for (E e : set) {
            newList.add(e);
        }
        return newList;
    }

    public static <E extends Comparable<E>> List<E> removeDuplicates2(List<E> list) {
        ArrayList<E> newList = new ArrayList<>();
        if (list.isEmpty()) {
            return newList;
        }

        boolean found = false;
        newList.add(list.get(0));

        for (int i = 1; i < list.size(); i++) {
            E item = list.get(i);

            for (int j = 0; j < newList.size(); j++) {
                E item2 = newList.get(j);
                if (item.compareTo(item2) == 0) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                newList.add(item);
            }
            found = false;
        }
        return newList;
    }
}
