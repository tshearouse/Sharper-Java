package org.sharper.parsers;

import java.util.Optional;

public class Int {
    public Optional<Integer> tryParse(String value) {
        try {
            return Optional.of(Integer.parseInt(value));
        }
    }
}
