package javaExamples;


public class ErrorField {

    private String text;
    private String SQLSTATE;

    public String getSQLSTATE() {
        return SQLSTATE;
    }

    public void setSQLSTATE(String SQLSTATE) {
        this.SQLSTATE = SQLSTATE;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
