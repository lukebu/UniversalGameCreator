package com.lukbu.character;

public class ExperiencePoint {

    private final long initialCharacterExperiencePoints;
    private final long characterExperiencePoints;
    private final long maxCharacterExperiencePoints;

    public ExperiencePoint(long initialCharacterExperiencePoints, long characterExperiencePoints, long maxCharacterExperiencePoints) {
        this.initialCharacterExperiencePoints = initialCharacterExperiencePoints;
        this.characterExperiencePoints = characterExperiencePoints;
        this.maxCharacterExperiencePoints = maxCharacterExperiencePoints;
    }

    public long getInitialCharacterExperiencePoints() {
        return initialCharacterExperiencePoints;
    }

    public long getCharacterExperiencePoints() {
        return characterExperiencePoints;
    }

    public long getMaxCharacterExperiencePoints() {
        return maxCharacterExperiencePoints;
    }
}
