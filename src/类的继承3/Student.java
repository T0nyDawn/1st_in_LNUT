package ��ļ̳�3;
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
		System.out.println("������"+name+"\n�Ա�"+sex+"\n���䣺"+age+"\nѧԺ:"+college);
	}
}
