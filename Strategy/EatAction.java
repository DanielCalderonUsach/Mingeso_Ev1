public class EatAction implements ActionStrategy {

	@Override
	public void action(String animal) {
		String act = "You feed the ";
		act = act + animal + "\n";
		System.out.println(act);
	}
}