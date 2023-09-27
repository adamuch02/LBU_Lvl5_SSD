class Rectangle extends Shape
{
	private double length;
	private double width;
	
	public double get_length()
	{
		return length;
	}
	
	public void set_length(double length)
	{
		this.length = length;
	}

	public double get_width()
	{
		return width;
	}

	public void set_width(double width)
	{
		this.width = width;
	}

	public double get_surface_area()
	{
		return length * width;
	}

	Rectangle(double length, double width)
	{
		super(4);
		this.length = length;
		this.width = width;
	}
}
