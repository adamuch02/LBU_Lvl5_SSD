abstract class Shape
{
	protected int number_of_sides;

	abstract public double get_surface_area();

	public int get_number_of_sides()
	{
		return number_of_sides;
	}
	
	public void set_number_of_sides(int number_of_sides)
	{
		this.number_of_sides = number_of_sides;
	}
	
	Shape(int number_of_sides)
	{
		this.number_of_sides = number_of_sides;
	}
}
