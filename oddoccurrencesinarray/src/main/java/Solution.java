import java.util.Arrays;

/**
 * Created by S.Tibriz on 17-3-2017.
 */
public class Solution {
    public int solution(int[] A) {
        return Arrays.stream(A).reduce((x, y) -> x ^ y).getAsInt();
    }

}


