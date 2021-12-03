package 简单GUI;
/*2.编写图形用户界面程序，实现如下功能：
1）放置三个单选按钮，选择其中一个单选按钮，修改窗体的背景颜色为该单
   选按钮指定的颜色。如 单选按钮文本为“红色”，选择它后，窗体背景色
   变为红色。  
2）点击“退出”按钮，退出程序；*/
import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
public class MainClass 
{
	public static void main(String[] args) 
	{
		new MyFrame();
	}
}
class MyFrame extends JFrame implements ActionListener
{
	JButton btn1,btn2,btn3;
	JPanel jp1=new JPanel();
	public MyFrame()
	{
		btn1=new JButton("红色");
		btn1.addActionListener(this);//一定要注册事件监听器
		btn2=new JButton("蓝色");
		btn2.addActionListener(this);
		btn3=new JButton("退出");
		btn3.addActionListener(this);
		this.add(jp1);
		jp1.add(btn1);
		jp1.add(btn2);
		jp1.add(btn3);
		setTitle("我的电脑");
		setSize(500,300);
		setVisible(true);		
	}
	public void actionPerformed(ActionEvent e)
	{
		JButton mi=(JButton)e.getSource();
		if(mi==btn1)
		{
			jp1.setBackground(Color.red);
		}
		if(mi==btn2)
		{
			jp1.setBackground(Color.blue);
		}
		if(mi==btn3)
		{
			System.exit(0);
		}
	}
}