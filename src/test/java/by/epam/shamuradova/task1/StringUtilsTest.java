package by.epam.shamuradova.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {
    @Test
    public void isPositiveNumber() {
        assertTrue(StringUtils.isPositiveNumber("5"));

    }
    @Test
    public void isNegativeNumber() {
        assertFalse(StringUtils.isPositiveNumber("-5"));

    }
}
