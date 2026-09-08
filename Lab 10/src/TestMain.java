public class TestMain {
    public static void main(String[] args) {

    ObjectiveQuestion question1 = new ObjectiveQuestion(10, 5, 4,
            "Who is the creator of java?", "John Java");

    FillInTheBlankQuestion question2 = new FillInTheBlankQuestion(10, 5, 1,
            "_____ is my java professor", "__Fiore__ is my java professor");

    MultipleChoiceQuestion question3 = new MultipleChoiceQuestion(
            15, 7, 1,
            "Which of the following is not a programming language?",
            "**Mine++**",
            "\n 1: Python\n 2: Mine++\n 3: HTML\n 4: CSS"
    );

    ObjectiveQuestion[] questions = { question1, question2, question3};
    Test Test1 = new Test(questions);
    System.out.println(Test1);
    System.out.println(Test1.displayAnswerKey());
}
}

