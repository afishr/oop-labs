package lab3;

public class Main
{
	public static void main(String[] args)
	{
		Text text = new Text("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Amet nisl purus in mollis nunc sed id. Quis commodo odio aenean sed adipiscing diam donec. At varius vel pharetra vel. Enim sed faucibus turpis in.");
		
		text.printTop5Often();
		text.printTop5Long();
	}
}
