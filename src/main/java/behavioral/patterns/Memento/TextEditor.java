package behavioral.patterns.Memento;

public class TextEditor {
    private String text = "";

    public void type(String txt) {
        this.text += txt;
    }
    public String getText() {
        return this.text;
    }
    public Memento save() {
        return new Memento(text);
    }
    public void restore(Memento memento) {
        text = memento.getState();
    }

}
