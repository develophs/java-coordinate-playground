package coordinate.v1.util;

import java.util.Arrays;
import java.util.List;

public class InputParser {

    private final String input;

    public InputParser(final String input) {
        this.input = input;
    }

    public List<String> parse(final String delimiter) {
        return Arrays.asList(input.split(delimiter));
    }

}
