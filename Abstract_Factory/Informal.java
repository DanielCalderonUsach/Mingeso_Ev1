public class Informal implements AbstractFactory{

    @Override
    public Torso createTorso(){
        Torso torso = new InformalTorso();
        torso.createTorso();
        return torso;
    }

    @Override
    public Piernas createPiernas(){
        Piernas piernas = new InformalPiernas();
        piernas.createPiernas();
        return piernas;
    }

    @Override
    public Pies createPies(){
        Pies pies = new InformalPies();
        pies.createPies();
        return pies;
    }
}