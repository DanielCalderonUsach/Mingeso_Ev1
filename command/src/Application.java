import java.util.ArrayList;
import java.util.function.Function;

public class Application {

    public ArrayList<Integer> array;
    public Editor editor;
    public CommandHistory history;

    ///Entorno donde se redefinen los objetos que emitiran un comando en especifico, con lo cual puede ocurrir
    ///que emisores distintos puedan realizar el mismo comando

    public void executeCommand(Command c, int n){
        if(c.execute(n)){
            history.push(c);
        }
    }

    public void undo(){
        Command c = history.pop();
        if(c != null){
            c.undo();
        }
    }
}

