package 类的继承2;
public class MainClass {
	public static void main(String[] args) {
		Cube c1=new Cube(2);
		Square s1=new Square(2);
		System.out.print("正方形的面积为："+s1.area()
	                    	+"\n正方体的表面积为："+c1.SurfaceArea()
	                    	+"\n正方体的体积为："+c1.Volume());

	}

}
