package J2SE;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JTextField;

public class Swinghello extends JFrame{
	private JLabel myLabel;
	private JTextField myTextField;
	private JButton myButton;
	
	public Swinghello(){
		super();
		this.setSize(400, 300);
		this.getContentPane().setLayout(null);
		this.setTitle("My First Swing Window");
		this.add(getJLabel(),null);
		this.add(getJTextField(),null);
		this.add(getJButton(),null);
	}
	//先声明一个控件，然后getJLabel()，返回一个JLabel实例
	private JLabel getJLabel(){
		if(myLabel==null){
			myLabel=new JLabel();
			myLabel.setBounds(5,10,250,30);
			myLabel.setText("Hello! welcome to my window");
		}
		return myLabel;
		
	}
	private JTextField getJTextField(){
		if(myTextField==null){
			myTextField=new JTextField();
			myTextField.setBounds(5,45,200,30);
			myTextField.setText("hahahhahah");
			
		}
		return myTextField;
		
	}
	private JButton getJButton(){
		if(myButton==null){
			myButton=new JButton();
			myButton.setBounds(5,80,100,40);
			myTextField.setText("Click me!!!");
			myButton.addActionListener(new ActionListener(){
				//为其添加一个事件监听，从而使这个按钮可以响应用户的点击操作
				//ActionListener是用于接收操作事件的侦听器接口。
				//对处理操作事件感兴趣的类可以实现此接口，而使用该类创建的对
				//可使用组件的 addActionListener 方法向该组件注册。
				//在发生操作事件时，调用该对象的 actionPerformed 方法。	

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					myLabel.setForeground(Color.RED);
					myTextField.setBackground(Color.BLUE);
				}
				
				
				
			});
		}
		return myButton;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swinghello window=new Swinghello();
		window.setVisible(true);
	}
}
