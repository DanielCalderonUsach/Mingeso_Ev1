public class Insertar extends Command{

    private Application app;
    private Editor editor;
    Insertar(Application app, Editor editor){
        super(app, editor);
    }

    public boolean execute(int n){
        save();
        app.array = editor.addNumber(n);
        return true;
    }
}
