import java.util.ArrayList;

public class CommandHistory {
    private ArrayList<Command> history;

    public void push(Command c){
        history.add(0, c);
    }

    public Command pop(){
        return history.remove(0);
    }
}
