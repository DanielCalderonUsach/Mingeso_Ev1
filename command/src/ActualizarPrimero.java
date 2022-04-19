public class ActualizarPrimero extends Command{
    private Application app;
    private Editor editor;
    ActualizarPrimero(Application app, Editor editor){
        super(app, editor);
    }

    public boolean execute(int n){
        save();
        app.array = editor.updateFirstNumber(n);
        return true;
    }
}
