package 类的继承1;
public class MainClass 
{
	public static void main(String[] args) 
	{
		Sphere s1=new Sphere(3);
		Circle c1=new Circle(3);
		System.out.println("球的表面积为："+s1.area()
		   					+"\n球的体积为："+s1.volume()
		   					+"\n圆的面积为："+c1.area()
				);

	}
}




