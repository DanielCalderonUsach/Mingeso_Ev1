public class TestMain{

	public static void main(String[] args) {
		
		String animal = "Dog";

		System.out.println("----------------------------------------");
		System.out.println("            Patron Strategy             ");
		System.out.println("----------------------------------------");

		ActionContext context = new ActionContext();
		context.setActionMethod(new PetAction());
		context.actionAnimal(animal);

		System.out.println("----------------------------------------");

		context.setActionMethod(new PlayAction());
		context.actionAnimal(animal);

		System.out.println("----------------------------------------");

		context.setActionMethod(new EatAction());
		context.actionAnimal(animal);

		System.out.println("----------------------------------------");
	}
}