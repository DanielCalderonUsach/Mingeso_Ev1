public class PlayAction implements ActionStrategy {

	@Override
	public void action(String animal) {
		String act = "You play with the ";
		act = act + animal + "\n";
		System.out.println(act);
	}
}