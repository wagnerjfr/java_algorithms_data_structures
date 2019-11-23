# java_algorithms_data_structures
Collection of Java classes with all kinds of algorithms and data structures using Java

### 1. SetOfStacks
Description:
```
/**
 * Implement a data structure SetOfStacks that should be composed of several stacks,
 * and should create a new stack once the previous one exceeds capacity. 
 * SetOfStacks.push() and SetOfStacks.pop() should behave identically to a single stack
 * (that is, pop() should return the same values as it would if there were just a single stack).
 *
 * Implement a function popAt(int index) which performs a pop operation on a specific sub-stack.
 */
```
[Code link](https://github.com/wagnerjfr/java_algorithms_data_structures/blob/master/SetOfStacks.java)

Sample output:
```console
[[1, 2, 3], [4, 5, 6], [7, 8]]
3
[[1, 2], [4, 5, 6], [7, 8]]
null
[[1, 2], [4, 5, 6], [7, 8]]
6
[[1, 2], [4, 5], [7, 8]]
[[1, 2], [4, 5], [7, 8, 9], [10, 11]]
11
10
9
8
[[1, 2], [4, 5], [7]]
[[1, 2], [4, 5], [7, 13]]
```
### 2. Sum2LinkedListNumbers
Description:
```
/**
 * You have two numbers represented by a linked list, where each node contains a sin-
 * gle digit. The digits are stored in reverse order, such that the 1’s digit is at the head of
 * the list. Write a function that adds the two numbers and returns the sum as a linked
 * list.
 * EXAMPLE
 * Input: (3 -> 1 -> 5) + (5 -> 9 -> 2)
 * Output: 8 -> 0 -> 8
 */
```
[Code link](https://github.com/wagnerjfr/java_algorithms_data_structures/blob/master/Sum2LinkedListNumbers.java)

Sample output:
```console
[5] + [5, 1]
[0, 2]

[3, 1, 5] + [5, 9, 2]
[8, 0, 8]

[9, 9, 9] + [9, 9, 9]
[8, 9, 9, 1]
```
### 3. MyQueueWith2Stacks
Description:
```
/**
 * A MyQueue class which implements a queue using two stacks.
 */
```
[Code link](https://github.com/wagnerjfr/java_algorithms_data_structures/blob/master/MyQueueWith2Stacks.java)

Sample output:
```console
Stack1: [1, 2, 3], Stack2: []
Dequeue: 1
Stack1: [], Stack2: [3, 2]
Stack1: [4, 5, 6], Stack2: [3, 2]
Dequeue: 2
Dequeue: 3
Stack1: [4, 5, 6], Stack2: []
Dequeue: 4
Stack1: [], Stack2: [6, 5]
```
### 4. BinaryTreeFromSortedArray
Description:
```
/**
 * Given a sorted (increasing order) array, write an algorithm to create a binary tree with
 * minimal height.
 *
 * EXAMPLE:
 * [1,2,3,4,5,6,7] -> {4,2,1,3,6,5,7}
 *
 *          4
 *         / \
 *       2     6
 *      / \   / \
 *     1  3  5   7
 */
```
[Code link](https://github.com/wagnerjfr/java_algorithms_data_structures/blob/master/BinaryTreeFromSortedArray.java)

Sample output:
```console
4,2,1,3,6,5,7,
```
### 5. LinkedListsOfBinaryTreeDepthPaths
Description:
```
/**
 * Given a binary search tree, design an algorithm which creates a linked list of all the
 * nodes at each depth (i.e., if you have a tree with depth D, you’ll have D linked lists)
 *
 * EXAMPLE:
 *          10
 *         /  \
 *        5    15
 *      /  \     \
 *     1    8     20
 *           \
 *            9
 *
 * LinkedList1: 10, 5, 1
 * LinkedList2: 10, 5, 8, 9
 * LinkedList3: 10, 15, 20
 */
```
[Code link](https://github.com/wagnerjfr/java_algorithms_data_structures/blob/master/LinkedListsOfBinaryTreeDepthPaths.java)

Sample output:
```console
[[10, 5, 1], [10, 5, 8, 9], [10, 15, 20]]
```
### 6. SortArraysIterators
Description:
```
/**
 * Sort 2 sorted arrays using Iterators
 *
 * EXAMPLE:
 * a1: [3,5,6,9]
 * a2: [1,7,8]
 * result: [1,3,5,6,7,8,9]
 */
```
[Code link](https://github.com/wagnerjfr/java_algorithms_data_structures/blob/master/SortArraysIterators.java)

Sample output:
```console
[1, 3, 5, 6, 7, 8, 9]
```
### 7. Nth2LastElementLinkedList
Description:
```
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
```
[Code link](https://github.com/wagnerjfr/java_algorithms_data_structures/blob/master/Nth2LastElementLinkedList.java)

Sample output:
```console
4
3
2
```
### 8. GenericArrayListDuplicate
Description:
```
/**
 * A sample class of removing duplicated items from a using "generic" ArrayList
 */
```
[Code link](https://github.com/wagnerjfr/java_algorithms_data_structures/blob/master/GenericArrayListDuplicate.java)

Sample output:
```console
[apple, orange, apple, orange, lemon, banana]
[apple, orange, lemon, banana]
[apple, orange, lemon, banana]
[10, 20, 30, 10, 30, 50, 50]
[10, 20, 30, 50]
[10, 20, 30, 50]
```
