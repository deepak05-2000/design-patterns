package behavioral.patterns.Memento;

public class MementoExample {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();
        editor.type("Hello");
        history.save(editor.save());
        editor.type(" World");
        history.save(editor.save());

        System.out.println("Current State : " + editor.getText());

        editor.restore(history.undo());

        System.out.println("After 1st undo : " + editor.getText());

        editor.restore(history.undo());

        System.out.println("After 2nd undo : " + editor.getText());


    }
}
