package lab2.task1;

public class Main
{
	
	public static void main(String[] args)
	{
		Box box1 = new Box();
		Box box2 = new Box(3);
		Box box3 = new Box(3, 2, 1);
		
		System.out.println(box1.getVolume());
		System.out.println(box1.getSurface());
		System.out.println();
		System.out.println(box2.getVolume());
		System.out.println(box2.getSurface());
		System.out.println();
		System.out.println(box3.getVolume());
		System.out.println(box3.getSurface());
	}
}