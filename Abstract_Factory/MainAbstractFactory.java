public class MainAbstractFactory{

	public static void main(String[] args) throws Exception {

		System.out.println("----------------------------------------");
		System.out.println("        Patron Abstract Factory         ");
		System.out.println("----------------------------------------");

		String tipo = "Informal";
		AbstractFactory factory;

		if(tipo == "Formal"){
			factory = new Formal();
		}
		else if(tipo == "Informal"){
			factory = new Informal();
		}
		else{
			throw new Exception("Error! Unknown operating system.\n");
		}

		Application app = new Application(factory);
		app.createRopa();
		app.mostrarRopa();
	}
}