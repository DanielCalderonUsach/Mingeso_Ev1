public class Formal implements AbstractFactory{

    @Override
    public Torso createTorso(){
        Torso torso = new FormalTorso();
        torso.createTorso();
        return torso;
    }

    @Override
    public Piernas createPiernas(){
        Piernas piernas = new FormalPiernas();
        piernas.createPiernas();
        return piernas;
    }

    @Override
    public Pies createPies(){
        Pies pies = new FormalPies();
        pies.createPies();
        return pies;
    }
}