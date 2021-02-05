import java.util.ArrayList;

public class MultipleChoice extends Question{
    private ArrayList<String> choices;

    public MultipleChoice(String type, String content, ArrayList<String> choices) {
        super(type, content);
        this.choices = choices;
    }

    public ArrayList<String> getChoices() {
        return choices;
    }

    public void printChoices(){
        for(String choice : this.choices){
            System.out.println( choices.indexOf(choice) + ".) " + choice + '\n');
        }
    }
}
