import org.junit.Assert;
import org.junit.Test;

/**
 * Created by S.Tibriz on 14-3-2017.
 */
public class SolutionTest {
    @Test
    public void binarygapSolutionTest() {
        Solution solution = new Solution();
        Assert.assertEquals("the function should return 7", 13, solution.solution(getDummyArray()));
    }

    private int[] getDummyArray() {
        int[] A = new int[9];
        A[0] = 13;
        A[1] = 3;
        A[2] = 9;
        A[3] = 3;
        A[4] = 9;
        A[5] = 7;
        A[6] = 9;
        A[7] = 7;
        A[8] = 9;
        return A;
    }
}
