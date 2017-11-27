package com.tq.GetNetResourceSize;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GetNetResourceSize extends JFrame {
	//声明两个文本框控件，分别用于放置链接和资源的尺寸
	private JTextField textField_size;
	private JTextField textField_url;
	private JTextArea textField_content;
	public static void main(String args[]) {
		 //用异常捕获结构防止创建窗体时出错
        try {
		GetNetResourceSize frame=new GetNetResourceSize();
		frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	//自定义的窗体构造方法，继承了JFrame
	public GetNetResourceSize() {
		//继承父类
        super();
        //设定标题栏内容
        setTitle("Get the size of resoure from Internet");
        //设置布局为空
        getContentPane().setLayout(null);
        //设定窗体位置及大小
        setBounds(200,200,400,220);
        //设置窗体关闭时的默认操作为“关闭”
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //新建一个标签，用于显示标题
        final JLabel label_title=new JLabel();
        //设置标签的前景色（字体的颜色）
        label_title.setForeground(Color.green);
        //设置标签的字体样式为加粗，大小为20号
        label_title.setFont(new Font("",Font.BOLD,20));
        //设置标签内要显示的文本
        label_title.setText("Get the size of resoure from Internet");;
        label_title.setBounds(5,5,400,50);
        
        //设置了两个标签显示文本框的标题
        final JLabel label_title_url=new JLabel();
        label_title_url.setText("Enter URL: ");
        label_title_url.setBounds(10,80,80,25);
        
        final JLabel label_title_size=new JLabel();
        label_title_size.setText("Size: ");
        label_title_size.setBounds(10,125,125,25);
        
        //实例化之前声明的这个文本框对象，并设置其位置和大小
        textField_url = new JTextField();
        textField_url.setBounds(80, 80, 286, 25);
        
        textField_size=new JTextField();
        textField_size.setBounds(80,125,145,25);
        
        textField_content = new JTextArea();
        textField_content.setBounds(80, 125, 855, 500);
        
        //声明并实例化了一个按钮，用于执行获取资源大小的操作
        final JButton button = new JButton();
        button.setText("Get the size");
        button.setBounds(235,125,135,25);
        //为按钮添加事件响应，这里用到了匿名内部类
        button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				//获得输入的网址，调用trim()方法过滤掉前后的空格
				String url=textField_url.getText().trim();
				
				try {
					long len=resourceSize(url);
					textField_size.setText(String.valueOf(len)+"byte(s)");
					/*Collection<String> urlCollection=getURLCollection(url);
					//获得这个集合对象的迭代器对象
					Iterator it=urlCollection.iterator();
					while(it.hasNext()){
						textField_content.append((String)it.next()+"\n");
					}
					*/
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
        	
        });
        //将上述所有自定义的控件添加到父容器中
        getContentPane().add(label_title);
        getContentPane().add(label_title_url);
        getContentPane().add(label_title_size);
        getContentPane().add(textField_url);
        getContentPane().add(textField_size);
        getContentPane().add(button);
	}
	
	/*public Collection<String> getURLCollection(String urlString){
		URL url=null;
		URLConnection conn = null;
		//创建基于ArralList的集合对象，元素为String类型
		Collection<String> urlConnection=new ArrayList<String>();
		try{
			url=new URL(urlString);
			conn=url.openConnection();
			conn.connect();
			//连接到url引用资源，建立通信链接
			//从连接中获取流对象,将这个流对象转换为字符流,将字符流转换为缓冲流对象
			InputStream is=conn.getInputStream();
			InputStreamReader in=new InputStreamReader(is,"UTF-8");
			BufferedReader br=new BufferedReader(in);
			String nextLine=br.readLine();
			
			while(nextLine!=null){
				urlConnection.add(nextLine);
				nextLine=br.readLine();
			}
		}catch(Exception ex){
	        ex.printStackTrace();
	    }
	
	    return urlConnection;
		
	}*/
	
	public long resourceSize(String sUrl) throws Exception{
		//创建url对象
		URL url=new URL(sUrl);
		//获得网络连接对象
		URLConnection urlConn=url.openConnection();
		//连接到url指定的资源
		urlConn.connect();
		return urlConn.getContentLength();
		
	}
}