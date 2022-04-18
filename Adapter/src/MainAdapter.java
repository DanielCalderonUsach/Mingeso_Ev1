public class MainAdapter{

    public static void main(String[] args) {

        System.out.println("----------------------------------------");
        System.out.println("             Patron Adapter             ");
        System.out.println("----------------------------------------");

        tenedor Tenedor = new tenedor();
        cuchillo Cuchillo = new cuchillo();
        carne Carne = new carne();

        Carne.cortarCarne(Cuchillo);

        ///Si hacemos lo siguiente
        ///Carne.cortarCarne(Tenedor); (sintaxis invalida)
        ///El tenedor no podra cortar la carne, para ello utilizamos un adaptador

        tenedorAdapter tAdapter = new tenedorAdapter(Tenedor);
        Carne.cortarCarne(tAdapter);
        ///Gracias al adaptador podemos cortar la carne, mientras que sin el adaptador, seguira siendo un tenedor que
        ///no podra cortar la carne
    }
}