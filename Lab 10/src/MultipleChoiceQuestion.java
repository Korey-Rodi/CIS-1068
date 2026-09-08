public  class MultipleChoiceQuestion extends ObjectiveQuestion {
    String possibleAnswers;

    public MultipleChoiceQuestion(int points, int difficulty, int answerSpace, String questionText, String correctAnswer, String possibleAnswers) {
        super(points, difficulty, answerSpace, questionText, correctAnswer);
        this.possibleAnswers = possibleAnswers;
    }
    public String getPossibleAnswers() {
        return possibleAnswers;
    }
    public void setPossibleAnswers(String possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }
    public String toString() {
        return super.toString() + "Possible Answers: " + possibleAnswers;
    }
}
