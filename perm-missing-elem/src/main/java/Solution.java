import java.util.stream.IntStream;

/**
 * Created by S.Tibriz on 7-4-2017.
 */
public class Solution {
    public int solution(int[] A) {
        int sumOfInputs = IntStream.of(A).sum();
        A = new int[A.length + 1];
        for (int i = 0; i < A.length; i++) {
            A[i] = i + 1;
        }
        int sumOfOutputs = IntStream.of(A).sum();
        return sumOfOutputs - sumOfInputs;
    }
}
