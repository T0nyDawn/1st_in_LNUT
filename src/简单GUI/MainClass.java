package ��GUI;
/*2.��дͼ���û��������ʵ�����¹��ܣ�
1������������ѡ��ť��ѡ������һ����ѡ��ť���޸Ĵ���ı�����ɫΪ�õ�
   ѡ��ťָ������ɫ���� ��ѡ��ť�ı�Ϊ����ɫ����ѡ�����󣬴��屳��ɫ
   ��Ϊ��ɫ��  
2��������˳�����ť���˳�����*/
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
		btn1=new JButton("��ɫ");
		btn1.addActionListener(this);//һ��Ҫע���¼�������
		btn2=new JButton("��ɫ");
		btn2.addActionListener(this);
		btn3=new JButton("�˳�");
		btn3.addActionListener(this);
		this.add(jp1);
		jp1.add(btn1);
		jp1.add(btn2);
		jp1.add(btn3);
		setTitle("�ҵĵ���");
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