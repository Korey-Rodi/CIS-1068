public class FillInTheBlankQuestion extends ObjectiveQuestion {

    public FillInTheBlankQuestion(int points, int difficulty, int answerSpace, String questionText, String correctAnswer) {
        super(points, difficulty, answerSpace, questionText, correctAnswer);
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
    
}
