// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class MissingInteger {
	public int solution(int[] A) {
        ArrayList<Integer> posArr = new ArrayList<Integer>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                posArr.add(A[i]);
            }
        }
        Collections.sort(posArr);
        
        if (posArr.size() == 0) {
            return 1;
        } else if (posArr.size() == 1) {
            if (posArr.get(0) == 1) {
                return 2;
            } else {
                return 1;
            }
        } else if (posArr.get(0) != 1) {
            return 1;
        }
        for (int i = 0; i < posArr.size()-1; i++) {
            if (posArr.get(i+1)-posArr.get(i) > 1) {
                return posArr.get(i)+1;
            }
        }
        return posArr.get(posArr.size()-1)+1;
    }
}