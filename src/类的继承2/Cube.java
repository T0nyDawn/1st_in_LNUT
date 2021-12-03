package ÀàµÄ¼Ì³Ğ2;
public class Cube extends Square
{
	private double A;
	public Cube()
	{}
	public Cube(double A)
	{
		this.A=A;
	}
	public double SurfaceArea()
	{
		return 6*A*A;
	}
	public double Volume()
	{
		return A*A*A;
	}
}
