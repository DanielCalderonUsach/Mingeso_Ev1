import java.util.ArrayList;

public class Editor {
    public ArrayList<Integer> array;

    public ArrayList<Integer> addNumber(int n){
        this.array.add(n);
        return this.array;
    }

    public ArrayList<Integer> deleteFirstNumber(int n){
        this.array.remove(n);
        return this.array;
    }

    public ArrayList<Integer> updateFirstNumber(int n){
        this.array.set(0,n);
        return this.array;
    }
}
