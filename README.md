# java_algorithms_data_structures
Collection of programs with all kinds of algorithms and data structures using Java

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
