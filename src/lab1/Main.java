package lab1;

public class Main
{
	
	public static void main(String[] args)
	{
		/*Monitor monitor1 = new Monitor("red", 45.5f, "1920x1080");
		monitor1.printProperties();
		
		monitor1.color = "black";
		monitor1.dimensions = 25.5f;
		
		monitor1.printProperties();
		
		Monitor monitor2 = new Monitor("orange", 20.0f, "1600x900");
		monitor2.printProperties();*/
		
		Student student1 = new Student("Student One", 20, 10f);
		Student student2 = new Student("Student Two", 22, 7.3f);
		Student student3 = new Student("Student Three", 23, 6.5f);
		Student student4 = new Student("Student Four", 43, 4.3f);
		Student student5 = new Student("Student Five", 21, 7.5f);
		Student student6 = new Student("Student Six", 53, 7.4f);
		Student student7 = new Student("Student Seven", 23, 4.4f);
		Student student8 = new Student("Student Eight", 21, 8.3f);
		Student student9 = new Student("Student Nine", 29, 8.1f);
		
		University asem = new University("ASEM", 1998, new Student[]{ student1, student2, student3 });
		University utm = new University("UTM", 1968, new Student[]{  student4, student5, student6 });
		University ulim = new University("ULIM", 1655, new Student[]{ student7, student8, student9 });
		
		System.out.println(Student.getAverageMark());
		System.out.println(asem.getAverageMark());
		System.out.println(ulim.getAverageMark());
		System.out.println(utm.getAverageMark());
	}
}