class Ellipse extends Rectangle
{
	private double minor_radius;
	private double major_radius;

	public double get_minor_radius()
	{
		return minor_radius;
	}

	public void set_minor_radius(double minor_radius)
	{
		this.minor_radius = minor_radius;
	}
	
	public double get_major_radius()
	{
		return major_radius;
	}
	
	public void set_major_radius(double major_radius)
	{
		this.major_radius = major_radius;
	}

	public double get_surface_area()
	{
		return minor_radius * major_radius * Math.PI;
	}

	Ellipse(double minor_radius, double major_radius)
	{ 	
		super(major_radius * 2, minor_radius * 2);
		this.minor_radius = minor_radius;
		this.major_radius = major_radius;
		number_of_sides = 2;
	}
}
