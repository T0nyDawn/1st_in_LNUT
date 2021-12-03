package 类的继承3;
public class Person 
{
	public String name,sex;
	public int age;
	public Person()
	{}
	public Person(String name,String sex,int age)
	{
		this.name=name;
		this.sex=sex;
		this.age=age;
	}
	public void output()
	{
		System.out.println("姓名："+name+"\n性别："+sex+"\n年龄："+age);
	}
	
}
