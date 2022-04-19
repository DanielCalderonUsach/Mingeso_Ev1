public class EliminarPrimero extends Command{
    private Application app;
    private Editor editor;
    EliminarPrimero(Application app, Editor editor){
        super(app, editor);
    }

    public boolean execute(int n){
        save();
        app.array = editor.deleteFirstNumber(n);
        return true;
    }
}
