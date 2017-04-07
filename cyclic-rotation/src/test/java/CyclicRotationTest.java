import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by S.Tibriz on 7-4-2017.
 */
public class CyclicRotationTest {
    @Test
    public void solution_cyclic_rotation(){
        Solution solution = new Solution();
        Assert.assertArrayEquals("the function should the expected array", getExpectedArray(), solution.solution(getDummyArray(),3));
    }

    private int[] getExpectedArray(){
        int[] B = new int[5];
        B[0] = 9;
        B[1] = 7;
        B[2] = 6;
        B[3] = 3;
        B[4] = 8;
        return B;
    }

    private int[] getDummyArray() {
        int[] A = new int[5];
        A[0] = 3;
        A[1] = 8;
        A[2] = 9;
        A[3] = 7;
        A[4] = 6;
        return A;
    }

}
