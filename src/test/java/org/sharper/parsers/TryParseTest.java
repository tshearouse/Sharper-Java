package org.sharper.parsers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.sharper.parsers.TryParse.*;

class TryParseTest {
    @Test
    void toIntShouldReturnInt() {
        assertEquals(1234, toInt("1234").getAsInt());
    }

    @Test
    void toIntReturnsEmptyOnFailure() {
        assertFalse(toInt("eleventy").isPresent());
    }

    @Test
    void toLongShouldReturnLong() {
        assertEquals(987654321L, toLong("987654321").getAsLong());
    }

    @Test
    void toLongReturnsEmptyOnFailure() {
        assertFalse(toLong("dozens of us, I tell you").isPresent());
    }

    @Test
    void toDoubleShouldReturnDouble() {
        assertEquals(3.141592, toDouble("3.141592").getAsDouble(), Double.MIN_VALUE);
    }

    @Test
    void toDoubleReturnsEmptyOnFailure() {
        assertFalse(toDouble("numbers").isPresent());
    }
}