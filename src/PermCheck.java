import java.util.*;

public class PermCheck {
	public int solution(int[] A) {
        if (A.length == 1) {
            // if first elem is 1, return 1, else 0
            return (A[0] == 1) ? 1 : 0;
        } else {
            Arrays.sort(A);
            if (A[0] != 1) {
                return 0;
            }
            for (int i = 0; i < A.length-1; i++) {
                if (A[i+1]-A[i] != 1) {
                    return 0;
                }
            }
            return 1;
        }
    }
}
