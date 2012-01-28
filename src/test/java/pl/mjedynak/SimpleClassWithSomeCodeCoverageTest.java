package pl.mjedynak;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SimpleClassWithSomeCodeCoverageTest {

    SimpleClassWithSomeCodeCoverage testee;

    @Before
    public void setUp() {
        testee = new SimpleClassWithSomeCodeCoverage();
    }

    @Test
    public void shouldReturnTrueForEqualToZero() {
        // given
        int zero = 0;

        // when
        boolean result = testee.isGreaterOrEqualToZero(zero);

        // then
        assertThat(result, is(true));
    }
}
