import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList<MultipleChoice> questions;
    private ArrayList<String> answers;
    private int correct = 0;
    private double quizScore = 0;

    public Quiz(ArrayList<MultipleChoice> questions, ArrayList<String> answers){
        this.questions = questions;
        this.answers = answers;
    }

    public void addQuestion(MultipleChoice newQuestion, String answer){
        this.questions.add(newQuestion);
        this.answers.add(answer);
    }

//    public void checkAnswer(String chosen, int index){
//        if(chosen.equals(answers.get(index))){
//            ++this.correct;
//        }else{
//            return;
//        }
//    }

    public double totalQuizScore(){
        return (this.correct/questions.size()) * 100;
    }

    public void runQuiz(){
        Scanner input = new Scanner(System.in);

        for(MultipleChoice question : questions) {
            ArrayList<String> possibleAnswers = question.getChoices();
            System.out.println(question.getContent() + '\n');
            question.printChoices();
            int answer = input.nextInt();
            if(possibleAnswers.get(answer).equals(answers.get(questions.indexOf(question)))){
                ++this.correct;
            }else{
                continue;
            }
        }

        System.out.println("Reached end of quiz. Correct answers: " + correct +
                '\n' + "final grade: " + totalQuizScore());
    }
}
