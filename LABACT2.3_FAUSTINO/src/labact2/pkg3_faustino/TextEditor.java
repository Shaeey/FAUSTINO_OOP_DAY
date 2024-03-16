
package labact2.pkg3_faustino;


public class TextEditor {
    private String text;
    private final String initialText;
    
    public TextEditor(String initialText) {
        this.text = initialText;
        this.initialText = initialText;
    }
    
    public String getText() {
        return text;
    }
    
    public void setText(String text) {
        this.text = text;
    }
    
    public void append(String newText) {
        this.text += newText;
    }
   
    public void delete(int i) {
        if (i <= text.length()) {
            this.text = this.text.substring(0, this.text.length() - i);
        }
    }

    public void undo() {
        this.text = this.initialText;
    }   
}