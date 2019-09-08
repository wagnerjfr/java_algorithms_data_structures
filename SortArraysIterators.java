/**
 * Sort 2 sorted arrays using Iterators
 *
 * EXAMPLE:
 * a1: [3,5,6,9]
 * a2: [1,7,8]
 * result: [1,3,5,6,7,8,9]
 */

package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SortArraysIterators {

    public static void main(String[] args) {
        List<Integer> a1 = Arrays.asList(3,5,6,9);
        List<Integer> a2 = Arrays.asList(1,7,8);
        System.out.println(sortArrays(a1, a2));
    }

    public static List<Integer> sortArrays(List<Integer> l1, List<Integer> l2) {
        List<Integer> result = new ArrayList<>();

        Iterator<Integer> i1 = l1.iterator();
        Iterator<Integer> i2 = l2.iterator();

        int aux1 = -1;
        int aux2 = -1;

        while (aux1 == -1 || aux2 == -1) {
            if (aux1 == -1) {
                if (i1.hasNext()) {
                    aux1 = i1.next();
                }
                else {
                    break;
                }
            }
            if (aux2 == -1) {
                if (i2.hasNext()) {
                    aux2 = i2.next();
                }
                else {
                    break;
                }
            }
            if (aux1 < aux2) {
                result.add(aux1);
                aux1 = -1;
            } else {
                result.add(aux2);
                aux2 = -1;
            }
        }

        result.add((aux1 == -1) ? aux2 : aux1);

        while (i1.hasNext()) {
            result.add(i1.next());
        }
        while (i2.hasNext()) {
            result.add(i2.next());
        }

        return result;
    }
}
