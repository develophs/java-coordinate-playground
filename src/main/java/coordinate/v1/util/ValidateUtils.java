package coordinate.v1.util;

import java.util.List;
import java.util.regex.Pattern;

public class ValidateUtils {

    // \\((\\d+),\\s*(\\d+)\\)" GPT한테 물어봄.
    private static final Pattern INPUT_REGEX = Pattern.compile("\\((\\d+),\\s*(\\d+)\\)");

    public static boolean validate(final String input) {
        return INPUT_REGEX.matcher(input).matches();
    }

    // 도저히 1depth를 못맞추겠다.
    public static boolean validateAll(final List<String> inputs) {
        for (String input : inputs) {
            if (!validate(input)) {
                return false;
            }
        }
        return true;
    }

}
