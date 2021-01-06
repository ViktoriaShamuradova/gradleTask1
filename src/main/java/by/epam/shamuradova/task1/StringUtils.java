package by.epam.shamuradova.task1;

import org.apache.commons.lang3.math.NumberUtils;

import java.math.BigDecimal;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (NumberUtils.isCreatable(str)) {
            BigDecimal b = new BigDecimal(str);

            return b.compareTo(BigDecimal.ZERO) > 0;

        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(StringUtils.isPositiveNumber("5"));
    }
}
