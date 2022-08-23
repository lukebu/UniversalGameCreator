package com.lukbu.character;

public class Level {

    private final int initialLevelValue;
    private final int actualLevelValue;
    private final int maxLevelValue;

    public Level (int actualLevelValue, int maxLevelValue) {
        this.actualLevelValue = actualLevelValue;
        this.maxLevelValue = maxLevelValue;
        this.initialLevelValue = 1;
    }

    public int getMaxLevelValue() {
        return maxLevelValue;
    }

    public int getActualLevelValue() {
        return actualLevelValue;
    }

    public int getInitialLevelValue() {
        return initialLevelValue;
    }
}
