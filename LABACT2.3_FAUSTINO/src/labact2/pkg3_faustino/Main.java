package labact2.pkg3_faustino;


public class Main {
    private static int editorType;
    private static String initialText;

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
        TextEditor editor;
        if (editorType == 1) {
            editor = new PrintTextEditor (initialText);
        } else {
            editor = new AdvancedTextEditor(initialText);
        }
        editor.append("def");
        editor.delete(3);
        editor.undo();
    }
}