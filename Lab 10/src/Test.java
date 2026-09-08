public class Test {
    ObjectiveQuestion[] questions;
    int totalPoints;

    public Test(ObjectiveQuestion[] questions) {
        this.questions = questions;
        for (int i = 0; i < questions.length; i++) {
            totalPoints += questions[i].getPoints();
        }
        System.out.println("Total Points for Test = " + totalPoints + " Points\n");    
    }

    public String toString() {
        String result = "";

        for (int i = 0; i < questions.length; i++) {
        
            result += ("Question " + (i + 1) + ": ");
            result += questions[i];
            result += "\n";
        }

        return result;
    }

    public String displayAnswerKey() {
        String answer = "";
        answer += "\nDisplaying Answer Key:\n\n";
        for (int i = 0; i < questions.length; i++) {
            answer += ("Question " + (i + 1) + ": ");
            answer += questions[i].displayAnswer();
            answer += "\n";
        }
        return answer;
    }
}
