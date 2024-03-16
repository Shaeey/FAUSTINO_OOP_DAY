package labact2.pkg3_faustino;


public class AdvancedTextEditor extends TextEditor {
    private String previousText;
    
    public AdvancedTextEditor(String initialText) {
        super(initialText);
        this.previousText = initialText;
    }
    
    @Override
    public void undo() {
        setText(previousText);
    }
    
    @Override
    public void delete(int i) {
        previousText = getText();
        super.delete(i);
    }

    @Override
    public String getText() {
        return super.getText();
    }

    /**
     *
     * @param newText
     */
    @Override
    public void setText(String newText) {
        super.setText(newText);
    }
}