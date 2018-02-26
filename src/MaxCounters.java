
public class MaxCounters {
	public int[] solution(int N, int[] A) {
		int counters[] = new int[N];
		int maxCounter = 0;
		int currMax = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] >= 1 && A[i] <= N) {
				int index = A[i]-1;
				if (counters[index] < maxCounter) {
					counters[index] = maxCounter+1;
				} else {
					counters[index]++;
				}
				if (counters[index] > currMax) {
					currMax = counters[index];
				}
			} else if (A[i] == N+1) {
				maxCounter = currMax;
			}
		}
		
		for (int i = 0; i < counters.length; i++) {
			if (counters[i] < maxCounter) {
				counters[i] = maxCounter;
			}
		}
		return counters;
	}
	
	public static void main(String[] args) {
		int test1[] = new int[]{3,4,4,6,1,4,4,6,5};
		MaxCounters mc = new MaxCounters();
		int ans1[] = mc.solution(5, test1);
		for (int i = 0; i < ans1.length; i++) {
			System.out.print(ans1[i] + " ");
		}
	}
}
