package org.sharper.parsers;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class TryParse {
    public static OptionalInt toInt(String value) {
        try {
            return OptionalInt.of(Integer.parseInt(value));
        } catch (NumberFormatException e) {
            return OptionalInt.empty();
        }
    }

    public static OptionalLong toLong(String value) {
        try {
            return OptionalLong.of(Long.parseLong(value));
        } catch (NumberFormatException e) {
            return OptionalLong.empty();
        }
    }

    public static OptionalDouble toDouble(String value) {
        try {
            return OptionalDouble.of(Double.parseDouble(value));
        } catch (NumberFormatException e) {
            return OptionalDouble.empty();
        }
    }
}
