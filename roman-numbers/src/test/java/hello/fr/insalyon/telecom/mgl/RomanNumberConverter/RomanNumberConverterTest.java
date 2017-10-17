package hello.fr.insalyon.telecom.mgl.RomanNumberConverter;

import hello.Hello;
import org.junit.After;
import org.junit.Test;
import org.junit.Before;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by max on 09/10/2017.
 */
public class RomanNumberConverterTest {
    RomanNumberConverter hello;

    @Before
    public void setup() {
        hello = new RomanNumberConverter();
    }

    @Test
    public void check() {
        assertThat(hello.converttoroman(1))
                .isEqualTo("I");
        assertThat(hello.converttoroman(5))
                .isEqualTo("V");
        assertThat(hello.converttoroman(10))
                .isEqualTo("X");
        assertThat(hello.converttoroman(50))
                .isEqualTo("L");
        assertThat(hello.converttoroman(100))
                .isEqualTo("C");
        assertThat(hello.converttoroman(500))
                .isEqualTo("D");
        assertThat(hello.converttoroman(1000))
                .isEqualTo("M");
        assertThatThrownBy(() -> hello.converttoroman(4))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("wrong Number");
    }

    @Test
    public void check2() {
        assertThat(hello.converttoint("I"))
                .isEqualTo(1);
        assertThat(hello.converttoint("V"))
                .isEqualTo(5);
        assertThat(hello.converttoint("X"))
                .isEqualTo(10);
        assertThat(hello.converttoint("L"))
                .isEqualTo(50);
        assertThat(hello.converttoint("C"))
                .isEqualTo(100);
        assertThat(hello.converttoint("D"))
                .isEqualTo(500);
        assertThat(hello.converttoint("M"))
                .isEqualTo(1000);
        assertThatThrownBy(() -> hello.converttoint(""))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("wrong romanNumber");
    }

    @After
    public void end() {hello = null;}
}
