package parametrized_tests.homework;


import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {

    static Stream<Arguments> getPersons() {
        return Stream.of(
                Arguments.of("1.9 50", "Very severely underweight"),
                Arguments.of("2.0 120", "Obese Class I (Moderately obese)"),
                Arguments.of("1.6 60", "Normal (healthy weight)"),
                Arguments.of("1.3 160", "Obese Class VI (Hyper Obese)"),
                Arguments.of("3.0 50", "Very severely underweight"),
                Arguments.of("2.0 89", "Normal (healthy weight)"),
                Arguments.of("1.0 1", "Very severely underweight")
        );
    }
}
