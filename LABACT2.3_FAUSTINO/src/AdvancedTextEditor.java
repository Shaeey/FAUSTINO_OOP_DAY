
public class AdvancedTextEditor extends TextEditor{
    private String previousText;
    
    public AdvancedTextEditor (String initialText) {
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
