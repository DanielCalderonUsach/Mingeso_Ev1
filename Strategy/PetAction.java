
public class PetAction implements ActionStrategy {

	@Override
	public void action(String animal) {
		String act = "You pet the ";
		act = act + animal + "\n";
		System.out.println(act);
	}
}