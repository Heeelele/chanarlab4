package mn.edu.must.sqat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class GradeCalculatorParameterizedTest {

    @ParameterizedTest
    @DisplayName("\u04AE\u0441\u0433\u044D\u043D \u0434\u04AF\u043D \u0448\u0430\u043B\u0433\u0430\u0445")
    @CsvSource({"95,A","90,A","89.99,B","80,B","70,C","60,D","59.99,F","0,F"})
    void letterGradeBoundaries(double score, String expected) {
        // Arrange
        GradeCalculator calc = new GradeCalculator();
        // Act
        String actual = calc.letterGrade(score);
        // Assert
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @DisplayName("\u041D\u0438\u0439\u0442 \u043E\u043D\u043E\u043E \u0448\u0430\u043B\u0433\u0430\u0445")
    @CsvSource({"10,40,10,10,30,100","0,0,0,0,0,0","5,20,5,5,15,50","8,35,9,8,25,85","7.5,32.5,8,7,25,80"})
    void totalScoreParameterized(double att, double lab, double quiz1, double quiz2, double exam, double expected) {
        // Arrange
        GradeCalculator calc = new GradeCalculator();
        // Act
        double actual = calc.totalScore(att, lab, quiz1, quiz2, exam);
        // Assert
        assertEquals(expected, actual, 0.0001);
    }
}
