package weather;

public class Cloud{
	private float bottom;
	private float top;
	Cloud(float bottom, float top)
	{
		this.bottom = bottom;
		this.top = top;
	}
	public float getHeight()
	{
		return top-bottom;
	}
	public String rain()
	{
		return "It is raining";
	
	}
} 