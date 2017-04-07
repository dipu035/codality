import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by S.Tibriz on 14-3-2017.
 */
public class Solution {
    public int solution(int N) {
        String binaryString = Integer.toBinaryString(N);
        String pattern = "([1]0+(?=1))";
        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(binaryString);
        int length = 0;
        while (m.find()) {
            if (length < m.group().replace("1", "").length())
                length = m.group().replace("1", "").length();
        }
        return length;
    }
}
