package mn.edu.must.sqat;

public class GradeCalculator {

    public String letterGrade(double score) {
        validate(score, 100);
        if (score >= 90) return "A";
        if (score >= 80) return "B";
        if (score >= 70) return "C";
        if (score >= 60) return "D";
        return "F";
    }

    public double totalScore(double att, double lab, double quiz1, double quiz2, double exam) {
        validate(att, 10);
        validate(lab, 40);
        validate(quiz1, 10);
        validate(quiz2, 10);
        validate(exam, 30);
        return att + lab + quiz1 + quiz2 + exam;
    }

    private void validate(double value, double max) {
        if (Double.isNaN(value)) throw new IllegalArgumentException("Invalid score");
        if (value < 0) throw new IllegalArgumentException("Invalid score");
        if (value > max) throw new IllegalArgumentException("Invalid score");
    }
}
