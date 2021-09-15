package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        String actual = "1,2";
        String[] result = actual.split(",");
        assertThat(result).contains("1", "2");

        actual = "1";
        result = actual.split(",");
        assertThat(result).containsExactly("1");

    }

    @Test
    void substring() {
        String actual = "(1,2)";

        String result = actual.substring(1, actual.length() - 1);
        assertThat(result).isEqualTo("1,2");
    }

    @DisplayName("StringIndexOutOfBounds Exception")
    @Test
    void charAt() {
        String actual = "abc";
        assertThatThrownBy(() -> {
            actual.charAt(4);
        }).isInstanceOf(StringIndexOutOfBoundsException.class);
    }
}
