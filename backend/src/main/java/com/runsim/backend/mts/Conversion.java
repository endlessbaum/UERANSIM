package com.runsim.backend.mts;

import java.util.Objects;

class Conversion<T> {
    public final ConversionLevel level;
    public final T value;
    public final int depth;

    public Conversion(ConversionLevel level, T value, int depth) {
        this.level = level;
        this.value = value;
        this.depth = depth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conversion<?> that = (Conversion<?>) o;
        return level == that.level &&
                Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(level, value);
    }
}
