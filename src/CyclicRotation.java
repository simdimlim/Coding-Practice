// you can also use imports, for example:
//import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class CyclicRotation {
    public int[] solution(int[] A, int K) {
        int newArr[] = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            newArr[(i+K) % A.length] = A[i];
        }
        return newArr;
    }
}