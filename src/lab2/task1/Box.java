package lab2.task1;

public class Box
{
	private float x;
	private float y;
	private float z;
	private float surface = 0f;
	private float volume = 0f;

	public Box()
	{
		x = 1f;
		y = 1f;
		z = 1f;
	}
	
	public Box(float size)
	{
		x = size;
		y = size;
		z = size;
	}
	
	public Box(float height, float width, float depth)
	{
		x = height;
		y = width;
		z = depth;
	}
	
	public float getVolume()
	{
		if (volume == 0f)
		{
			volume = x * y * z;
		}
		
		return volume;
	}
	
	public float getSurface()
	{
		if (surface == 0f)
		{
			surface = 2 * ((x * z) + (x * y) + (y * z));
		}
		
		return surface;
	}
}
