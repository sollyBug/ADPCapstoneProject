package za.ac.cput.Factory;

import za.ac.cput.Util.Helper;
import za.ac.cput.domain.MockTest;
import java.time.LocalDate;

public class MockTestFactory {

    public static MockTest createMockTest(int testId, LocalDate dateTaken, int score) {
//Validates the inputs
        if (!Helper.isValidId(testId)){
            throw new IllegalArgumentException("Test ID must be positive");

        }
        if (!Helper.isValidScore(score)){
            throw new IllegalArgumentException("Score must be between 0 and 100");

        }
        // business logic
        boolean passed = score >= 50;

        return new MockTest.Builder()
                .setTestId(testId)
                .setDateTaken(dateTaken)
                .setScore(score)
                .setPassed(passed)
                .build();
    }
}