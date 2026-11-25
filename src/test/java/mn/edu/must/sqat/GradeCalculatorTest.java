
package mn.edu.must.sqat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class GradeCalculatorTest {

    @Test
    @DisplayName("95 оноо A дүнтэй")
    void gradeA() {
        GradeCalculator calc = new GradeCalculator();
        String result = calc.letterGrade(95);
        assertEquals("A", result);
    }

    @Test
    @DisplayName("85 оноо B дүнтэй")
    void gradeB() {
        GradeCalculator calc = new GradeCalculator();
        String result = calc.letterGrade(85);
        assertEquals("B", result);
    }

    @Test
    @DisplayName("75 оноо C дүнтэй")
    void gradeC() {
        GradeCalculator calc = new GradeCalculator();
        String result = calc.letterGrade(75);
        assertEquals("C", result);
    }

    @Test
    @DisplayName("65 оноо D дүнтэй")
    void gradeD() {
        GradeCalculator calc = new GradeCalculator();
        String result = calc.letterGrade(65);
        assertEquals("D", result);
    }

    @Test
    @DisplayName("30 оноо F дүнтэй")
    void gradeF() {
        GradeCalculator calc = new GradeCalculator();
        String result = calc.letterGrade(30);
        assertEquals("F", result);
    }

    @Test
    @DisplayName("90 оноо яг A дүнтэй")
    void ninetyIsExactlyA() {
        GradeCalculator calc = new GradeCalculator();
        String result = calc.letterGrade(90);
        assertEquals("A", result);
    }

    @Test
    @DisplayName("89.99 оноо B дүнтэй")
    void belowNinety() {
        GradeCalculator calc = new GradeCalculator();
        String result = calc.letterGrade(89.99);
        assertEquals("B", result);
    }

    @Test
    @DisplayName("60 оноо яг D дүнтэй")
    void sixtyIsExactlyD() {
        GradeCalculator calc = new GradeCalculator();
        String result = calc.letterGrade(60);
        assertEquals("D", result);
    }

    @Test
    @DisplayName("59.99 оноо F дүнтэй")
    void belowSixty() {
        GradeCalculator calc = new GradeCalculator();
        String result = calc.letterGrade(59.99);
        assertEquals("F", result);
    }

    @Test
    @DisplayName("0 оноо F дүнтэй")
    void zeroScore() {
        GradeCalculator calc = new GradeCalculator();
        String result = calc.letterGrade(0);
        assertEquals("F", result);
    }

    @Test
    @DisplayName("100 оноо A дүнтэй")
    void maximumScore() {
        GradeCalculator calc = new GradeCalculator();
        String result = calc.letterGrade(100);
        assertEquals("A", result);
    }

    @Test
    @DisplayName("Сөрөг оноо алдаа үүсгэнэ")
    void negativeScore() {
        GradeCalculator calc = new GradeCalculator();
        double score = -1;
        assertThrows(IllegalArgumentException.class,
                () -> calc.letterGrade(score));
    }

    @Test
    @DisplayName("100-аас их оноо алдаа үүсгэнэ")
    void aboveMaximumScore() {
        GradeCalculator calc = new GradeCalculator();
        double score = 101;
        assertThrows(IllegalArgumentException.class,
                () -> calc.letterGrade(score));
    }

    @Test
    @DisplayName("Нийт оноо 100 байх ёстой")
    void validTotalScore() {
        GradeCalculator calc = new GradeCalculator();
        double result = calc.totalScore(10, 40, 10, 10, 30);
        assertEquals(100.0, result, 0.0001);
    }

    @Test
    @DisplayName("Сөрөг ирцийн оноо алдаа үүсгэнэ")
    void negativeAttendance() {
        GradeCalculator calc = new GradeCalculator();
        double attendance = -5;
        assertThrows(IllegalArgumentException.class,
                () -> calc.totalScore(attendance, 40, 10, 10, 30));
    }

    @Test
    @DisplayName("Лабораторийн оноо 40-өөс хэтэрч болохгүй")
    void invalidLabScore() {
        GradeCalculator calc = new GradeCalculator();
        double lab = 41;
        assertThrows(IllegalArgumentException.class,
                () -> calc.totalScore(10, lab, 10, 10, 30));
    }
}
