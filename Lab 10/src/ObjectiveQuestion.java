public class ObjectiveQuestion extends Question {
    String correctAnswer;

    public ObjectiveQuestion(int points, int difficulty, int answerSpace, String questionText, String correctAnswer) {
        super(points, difficulty, answerSpace, questionText);
        this.correctAnswer = correctAnswer;
    }
    public String getCorrectAnswer() {
        return correctAnswer;
    }
    public String setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
        return correctAnswer;
    }
    public String toString() {
        return super.toString();
    }
    public String displayAnswer() {
        return "Correct Answer: " + correctAnswer;
    }
}