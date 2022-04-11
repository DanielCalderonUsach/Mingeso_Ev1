public class ActionContext {

    private ActionStrategy strategy;

    public void setActionMethod(ActionStrategy strategy) {
        this.strategy = strategy;
    }

    public ActionStrategy getStrategy() {
        return this.strategy;
    }

    public void actionAnimal(String animal){
        this.strategy.action(animal);
    }
}