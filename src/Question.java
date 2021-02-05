import java.util.ArrayList;

public class Question {
    private String type;
    private String content;

    public Question(String type, String content){
        this.type = type;
        this.content = content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setNumber(String type){
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public String getType() {
        return type;
    }
}
