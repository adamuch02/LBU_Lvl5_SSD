class Circle extends Shape
{
	private double radius;

	public double get_radius()
	{
		return radius;
	}

	public void set_radius(double radius)
	{
		this.radius = radius;
	}
	
	public double get_surface_area()
	{
		return Math.PI * radius * radius;
	}

	Circle(double radius)	
	{
		super(1);
		this.radius = radius;
	}
}
