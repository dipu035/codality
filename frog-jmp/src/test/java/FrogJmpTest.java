import org.junit.Assert;
import org.junit.Test;

/**
 * Created by S.Tibriz on 7-4-2017.
 */
public class FrogJmpTest {
    @Test
    public void solution_frog_jmp_test(){
        Solution solution = new Solution();
        Assert.assertEquals("The method should return 3",3,solution.solution(10,85,30));
    }
}
