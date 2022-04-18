public class Application {
    private AbstractFactory factory;
    private Torso torso;
    private Piernas piernas;
    private Pies pies;

    Application(AbstractFactory factory){
        this.factory = factory;
    }

    public void createRopa(){
        this.torso = factory.createTorso();
        this.piernas = factory.createPiernas();
        this.pies = factory.createPies();
    }

    public void mostrarRopa(){
        System.out.println(this.torso.getTorso());
        System.out.println(this.piernas.getPiernas());
        System.out.println(this.pies.getPies());
    }
}