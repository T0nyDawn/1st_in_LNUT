package ÀàµÄ¼Ì³Ð1;

public class Sphere extends Circle
{
	private double r2;
	Sphere()
	{}
	Sphere(double r2)
	{
		this.r2=r2;
	}
	public double area()
	{
		return 4*PI*r2*r2;
	}
	
    public	double volume()
    {
    	return  4*PI*r2*r2*r2/3;
    }
}
