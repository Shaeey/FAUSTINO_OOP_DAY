

public class PrintTextEditor extends TextEditor {
    public PrintEditor(String InitialText) {
        super(initialText);
    }
    
    public void print() {
        System.out.println(getText());
    }
}
