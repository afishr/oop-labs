package lab1;

public class Monitor
{
	public String color;
	public float dimensions;
	public String resolution;
	
	public Monitor(String color, float dimensions, String resolution) {
		this.color = color;
		this.dimensions = dimensions;
		this.resolution = resolution;
	}
	
	public void printProperties() {
		System.out.println("Color: " + this.color);
		System.out.println("Dimensions: " + this.dimensions);
		System.out.println("Resolution: " + this.resolution);
		System.out.println();
	}
	
	public void compareMonitors(Monitor extObj) {
		if (this.dimensions > extObj.dimensions)
		{
			System.out.println("First monitor is bigger than the second");
		}
		else
		{
			System.out.println("Second monitor is bigger than the first");
		}
	}
}
