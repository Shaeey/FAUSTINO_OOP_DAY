
public class AdvancedTextEditor1 extends TextEditor{
    private String previousText;
    
    public AdvancedTextEditor1 (String initialText) {
        super(initalText);
        this.previousText = initialText;
    }
    
    public void undo() {
        setText(previousText);
    }
    
    @Override
    public void delete(int i) {
        previousText = getText();
        super.delete(i);
    }
}
