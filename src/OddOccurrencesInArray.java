// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class OddOccurrencesInArray {
    public int solution(int[] A) {
        Arrays.sort(A);
        int curr = 0;
        int currCount = 0;
        boolean currSet = false;
        for (int i = 0; i < A.length; i++) {
            if (curr != A[i] && currSet == false) {
                curr = A[i];
                currCount++;
                currSet = true;
            } else if (curr == A[i]) {
                currCount++;
            } else {
                if (currCount % 2 != 0) {
                    return curr;
                } else {
                    curr = A[i];
                    currCount = 1;
                }
            }
        }
        return curr;
    }
}