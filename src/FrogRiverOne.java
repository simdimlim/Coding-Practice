// you can also use imports, for example:
 import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class FrogRiverOne {
	public int solution(int X, int[] A) {
        HashMap<Integer, Boolean> solHash = new HashMap<Integer, Boolean>();
        int posFound = 0;
        for (int i = 0; i < A.length; i++) {
            if (!solHash.containsKey(A[i])) {
                solHash.put(A[i], true);
                posFound++;
                if (posFound == X) {
                    return i;
                }
            }
        }
        return -1;
    }
}