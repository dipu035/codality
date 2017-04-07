import org.junit.Assert;
import org.junit.Test;

/**
 * Created by S.Tibriz on 14-3-2017.
 */
public class SolutionTest {
    @Test
    public void binarygapSolutionTest(){
        Solution solution = new Solution();
        Assert.assertEquals("The longest binary gap of integer 1041 sould return 5", 4, solution.solution(74901729));
    }
}
