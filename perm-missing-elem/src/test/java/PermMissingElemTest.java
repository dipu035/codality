import org.junit.Assert;
import org.junit.Test;

/**
 * Created by S.Tibriz on 7-4-2017.
 */
public class PermMissingElemTest {
    @Test
    public void solution_perm_missing_elem_test(){
        Solution solution = new Solution();
        Assert.assertEquals("The method should return 4",4,solution.solution(getDummyData()));
    }

    private int[] getDummyData() {
        return new int[]{2,3,1,5,6};
    }
}
