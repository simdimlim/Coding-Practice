
public class FrogJump {
	public int solution(int X, int Y, int D) {
        double remainingDist = Y - X;
        return (int) Math.ceil(remainingDist/D);
    }
}
