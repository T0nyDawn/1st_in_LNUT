package �ļ��Ķ�ȡ��д��;
//��д���򣬶�ȡC���µ��ļ�(Դ�ļ�.txt)���ݣ�����������д��D���µ��ļ���Ŀ���ļ�.txt���С�
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
