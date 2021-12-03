package 类的继承3;
public class Student extends Person
{
	public String college;
	public Student()
	{}
	public Student(String name,String sex,int age,String college )
	{
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.college=college;
	}
	public void output()
	{
		System.out.println("姓名："+name+"\n性别："+sex+"\n年龄："+age+"\n学院:"+college);
	}
}
