package edu.nik.examples.patterns.stream.stream01;

import java.util.Arrays;
import java.util.List;

public class StringProcessorTest {

    @Test
    void shouldFilterAndUppercaseStringsStartingWithA() {
        List<String> input = Arrays.asList(
                "Apple",
                "Banana",
                "Avocado",
                "Cherry",
                "Apricot",
                "almond"
        );

        List<String> result = StringProcessor.filterAndUppercase(input);

        List<String> expected = Arrays.asList(
                "APPLE",
                "AVOCADO",
                "APRICOT"
        );

        assertEquals(expected, result);
    }
}
