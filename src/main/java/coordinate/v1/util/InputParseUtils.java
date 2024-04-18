package coordinate.v1.util;

import java.util.Arrays;
import java.util.List;

public class InputParseUtils {

    private static final String FIRST_BRACKET = "(";
    private static final String LAST_BRACKET = ")";
    private static final String COMMA = ",";

    public static List<String> split(final String input, final String delimiter) {
        return Arrays.asList(input.split(delimiter));
    }

    public static int[] getPoints(final String input) {
        final String trimmed = removeBracket(input);
        final List<String> split = split(trimmed, COMMA);
        final Integer x = Integer.valueOf(split.get(0));
        final Integer y = Integer.valueOf(split.get(1));
        return new int[] {x, y};
    }

    private static String removeBracket(final String input) {
        final String trimmed = input.replace(FIRST_BRACKET, "").replace(LAST_BRACKET, "");
        return trimmed;
    }


}
