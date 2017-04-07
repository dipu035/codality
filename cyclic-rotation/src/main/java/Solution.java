import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/**
 * Created by S.Tibriz on 7-4-2017.
 * <p>
 * Task description
 * A zero-indexed array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is also moved to the first place.
 * <p>
 * For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7]. The goal is to rotate array A K times; that is, each element of A will be shifted to the right by K indexes.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int[] solution(int[] A, int K); }
 * <p>
 * that, given a zero-indexed array A consisting of N integers and an integer K, returns the array A rotated K times.
 * <p>
 * For example, given array A = [3, 8, 9, 7, 6] and K = 3, the function should return [9, 7, 6, 3, 8].
 * <p>
 * Assume that:
 * <p>
 * N and K are integers within the range [0..100];
 * each element of array A is an integer within the range [−1,000..1,000].
 */
public class Solution {
    public int[] solution(int[] A, int K) {
        List<Integer> input = IntStream.of(A).boxed().collect(Collectors.toList());
        Collections.rotate(input, K);
        return input.stream().mapToInt(i -> i).toArray();
    }
}
