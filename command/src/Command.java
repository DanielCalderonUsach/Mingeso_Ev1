import java.util.ArrayList;

public abstract class Command {
    private Application app;
    private Editor editor;
    private ArrayList<Integer> backup;

    Command(Application app, Editor editor){
        this.app= app;
        this.editor= editor;
    }

    public void save(){
        backup = editor.array;
    }

    public void undo(){
        editor.array = backup;
    }

    abstract boolean execute(int n);
}
