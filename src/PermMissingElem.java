// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class PermMissingElem {
    public int solution(int[] A) {
        Arrays.sort(A);
        if (A.length == 0) {
            return 1;
        } else if (A.length == 1) {
            if (A[0] == 1) {
                return 2;
            } else {
                return 1;
            }
        }
        for (int i = 0; i < A.length-1; i++) {
            // System.out.print(A[i] + " ");
            if (A[i+1]-A[i] != 1) {
               return A[i]+1;
            }
        }
        
        if (A[0] == 1) {
            return A[A.length-1]+1;
        } else {
            return 1;
        }
    }
}