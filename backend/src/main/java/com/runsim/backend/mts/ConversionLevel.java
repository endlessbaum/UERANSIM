package com.runsim.backend.mts;

enum ConversionLevel {
    LEVEL_NULL_CONVERSION(0),
    SAME_TYPE(1),
    ASSIGNABLE_TYPE(2),
    NUMERIC_CONVERSION(3),
    LEVEL_NO_CONVERSION(10000);

    private final int level;

    ConversionLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
