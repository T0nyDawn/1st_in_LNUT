package ��ļ̳�3;

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
		("������"+name+"\n�Ա�"+sex+"\n���䣺"+age+"\nѧԺ:"+college+"\n������:"+room);
	}
}
