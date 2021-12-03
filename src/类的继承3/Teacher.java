package 类的继承3;

public class Teacher extends Student
{
	public String room;
	public Teacher()
	{}
	public Teacher(String name,String sex,int age,String college,String room)
	{
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.college=college;
		this.room=room;
	}
	public void output()
	{
		System.out.println
		("姓名："+name+"\n性别："+sex+"\n年龄："+age+"\n学院:"+college+"\n教研室:"+room);
	}
}
