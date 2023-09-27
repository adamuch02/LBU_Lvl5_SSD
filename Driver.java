class Driver
{
	public static void main(String[] args)
	{
		Rectangle my_rectangle = new Rectangle(16, 9);
		Circle my_circle = new Circle(7);
		Ellipse my_ellipse = new Ellipse(24, 80);
		System.out.println(my_rectangle.get_surface_area());
		System.out.println(my_circle.get_surface_area());
		System.out.println(my_ellipse.get_surface_area());
	}
}
