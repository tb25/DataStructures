# DataStructures

Binary Search

Divide and conquer algorithm -
Given an array of presorted integers: A(0), A(1), A(2), ... , A(n-1) and and a target value X, find and return i such that X = A(i) or return -1 if X is not in the list.

Solution:

recursive:
check if the middle value is X and return if it is, else if the middle value is greater to X then search the left side of the list, this dividing the search time. Else search the right side. This is a recursive function, so the search will stop once X is found or the base case is reached.

iterative:
use a loop and conditionals with the same logic. while (left <= right){ mid = (left+right)/2; if X... }

Time complexity

Best case:
θ(1) when X = middle right away.

worst/ average case:
T(N) = θ(Log(N)), where, T(N) = the time complexity, θ(f(N)) = the tight bounded analysis.

Space complexity

Recursive:
O( log(N) ), where N = the depth of the tree, and describes how many recursive stacks have been called.

Iterative:
O(1) space since there are no stack calls.
