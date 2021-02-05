import java.util.ArrayList;

public class QuizRunner {
    public static void main(String[] args) {
        ArrayList<String> choices = new ArrayList<>();

        choices.add("wrong");
        choices.add("wrong2");
        choices.add("correct");

        ArrayList<MultipleChoice> smallQuiz = new ArrayList<>();

        MultipleChoice question = new MultipleChoice("multiple", "Which is correct?", choices);

        smallQuiz.add(question);

        ArrayList<String> answers = new ArrayList<>();
        answers.add("correct");

        Quiz myQuiz = new Quiz (smallQuiz, answers);

        myQuiz.runQuiz();


    }
}
