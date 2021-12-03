package 文件的读取与写入;
//编写程序，读取C盘下的文件(源文件.txt)内容，并将该内容写入D盘下的文件（目标文件.txt）中。
import java.io.*;
import java.util.*;
public class MainClass 
{
	public static void main(String[] args) throws Exception
	{
		FileReader in=new FileReader("D:\\java\\a.txt");
		FileWriter out=new FileWriter("C:\\java\\b.txt");
		int a;
		while((a=in.read())!=-1)
		{
			out.write(a);
		}
		in.close();
		out.close();
	}

}
