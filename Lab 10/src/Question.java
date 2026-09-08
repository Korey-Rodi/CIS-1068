public class Question {
    public static final int MIN_DIFFICULTY = 1;
    public static final int MAX_DIFFICULTY = 10;

    int points;
    int difficulty;
    int answerSpace;
    String questionText;

    public Question(int points, int difficulty, int answerSpace, String questionText) {
        if (difficulty < MIN_DIFFICULTY){
            difficulty = MIN_DIFFICULTY;
        }
        if (difficulty > MAX_DIFFICULTY){
            difficulty = MAX_DIFFICULTY;
        }
        this.points = points;
        this.difficulty = difficulty;
        this.answerSpace = answerSpace;
        this.questionText = questionText;
    }
    public int getPoints() {
        return points;
    }
    public int setPoints(int points) {
        this.points = points;
        return points;
    }
    public int getDifficulty() {
        return difficulty;
    }
    public int setDifficulty(int difficulty) {
        this.difficulty = difficulty;
        return difficulty;
    }
    public int getAnswerSpace() {
        return answerSpace;
    }
    public int setAnswerSpace(int answerSpace) {
        this.answerSpace = answerSpace;
        return answerSpace;
    }
    public String getQuestionText() {
        return questionText;
    }
    public String setQuestionText(String questionText) {
        this.questionText = questionText;
        return questionText;
    }
    protected String blankLines() {
    String s = "";
    for (int i = 0; i < answerSpace; i++) {
        s += "\n";
    }
    return s;
}

    public String toString() {
        return "Question: " + questionText + " | Points: " + points + " | Difficulty: " + difficulty + " | Answer Space: " + answerSpace + blankLines();
    }


}


