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

@SuppressWarnings("serial")
public class GetNetResourceContent extends JFrame {
	//澹版槑涓や釜鏂囨湰妗嗘帶浠讹紝鍒嗗埆鐢ㄤ簬鏀剧疆閾炬帴鍜岃祫婧愮殑灏哄
	private JTextField textField_url;
	private JTextArea textField_content;
	public static void main(String args[]) {
		 //鐢ㄥ紓甯告崟鑾风粨鏋勯槻姝㈠垱寤虹獥浣撴椂鍑洪敊
        try {
		GetNetResourceContent frame=new GetNetResourceContent();
		frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	
	
	//鑷畾涔夌殑绐椾綋鏋勯�犳柟娉曪紝缁ф壙浜咼Frame
	public GetNetResourceContent() {
		//缁ф壙鐖剁被
        super();
        //璁惧畾鏍囬鏍忓唴瀹�
        setTitle("Get the content of resoure from Internet");
        //璁剧疆甯冨眬涓虹┖
        getContentPane().setLayout(null);
        //璁惧畾绐椾綋浣嶇疆鍙婂ぇ灏�
        setBounds(0, 0, 1000, 800);
        //璁剧疆绐椾綋鍏抽棴鏃剁殑榛樿鎿嶄綔涓衡�滃叧闂��
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //鏂板缓涓�涓爣绛撅紝鐢ㄤ簬鏄剧ず鏍囬
        final JLabel label_title=new JLabel();
        //璁剧疆鏍囩鐨勫墠鏅壊锛堝瓧浣撶殑棰滆壊锛�
        label_title.setForeground(Color.green);
        //璁剧疆鏍囩鐨勫瓧浣撴牱寮忎负鍔犵矖锛屽ぇ灏忎负20鍙�
        label_title.setFont(new Font("",Font.BOLD,18));
        //璁剧疆鏍囩鍐呰鏄剧ず鐨勬枃鏈�
        label_title.setText("Get the content of resoure from Internet");;
        label_title.setBounds(5, 5, 500, 50);
        
        //璁剧疆浜嗕袱涓爣绛炬樉绀烘枃鏈鐨勬爣棰�
        final JLabel label_title_url=new JLabel();
        label_title_url.setText("Enter URL: ");
        label_title_url.setBounds(10,80,80,25);
        
        final JLabel label_title_size=new JLabel();
        label_title_size.setText("Content: ");
        label_title_size.setBounds(10,125,125,25);
        
        //瀹炰緥鍖栦箣鍓嶅０鏄庣殑杩欎釜鏂囨湰妗嗗璞★紝骞惰缃叾浣嶇疆鍜屽ぇ灏�
        textField_url = new JTextField();
        textField_url.setBounds(80, 80, 286, 25);
        
        textField_content = new JTextArea();
        textField_content.setBounds(80, 125, 855, 500);
        
        //澹版槑骞跺疄渚嬪寲浜嗕竴涓寜閽紝鐢ㄤ簬鎵ц鑾峰彇璧勬簮澶у皬鐨勬搷浣�
        final JButton button = new JButton();
        button.setText("Get the  Content");
        button.setBounds(800, 80, 135, 25);
        
        //涓烘寜閽坊鍔犱簨浠跺搷搴旓紝杩欓噷鐢ㄥ埌浜嗗尶鍚嶅唴閮ㄧ被
        button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				//鑾峰緱杈撳叆鐨勭綉鍧�锛岃皟鐢╰rim()鏂规硶杩囨护鎺夊墠鍚庣殑绌烘牸
				String url=textField_url.getText().trim();
				
				try {
					/*long len=resourceSize(url);
					textField_size.setText(String.valueOf(len)+"byte(s)");*/
					Collection<String> urlCollection=getURLCollection(url);
					//鑾峰緱杩欎釜闆嗗悎瀵硅薄鐨勮凯浠ｅ櫒瀵硅薄
					Iterator it=urlCollection.iterator();
					while(it.hasNext()){
						textField_content.append((String)it.next()+"\n");
					}
					
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
        	
        });
        //灏嗕笂杩版墍鏈夎嚜瀹氫箟鐨勬帶浠舵坊鍔犲埌鐖跺鍣ㄤ腑
        getContentPane().add(label_title);
        getContentPane().add(label_title_url);
        getContentPane().add(label_title_size);
        getContentPane().add(textField_url);
        getContentPane().add(textField_content);
        getContentPane().add(button);
	}
	
	public Collection<String> getURLCollection(String urlString){
		URL url=null;
		URLConnection conn = null;
		//鍒涘缓鍩轰簬ArralList鐨勯泦鍚堝璞★紝鍏冪礌涓篠tring绫诲瀷
		Collection<String> urlConnection=new ArrayList<String>();
		try{
			url=new URL(urlString);
			conn=url.openConnection();
			conn.connect();
			//杩炴帴鍒皍rl寮曠敤璧勬簮锛屽缓绔嬮�氫俊閾炬帴
			//浠庤繛鎺ヤ腑鑾峰彇娴佸璞�,灏嗚繖涓祦瀵硅薄杞崲涓哄瓧绗︽祦,灏嗗瓧绗︽祦杞崲涓虹紦鍐叉祦瀵硅薄
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
		
	}
	
	public long resourceSize(String sUrl) throws Exception{
		//鍒涘缓url瀵硅薄
		URL url=new URL(sUrl);
		//鑾峰緱缃戠粶杩炴帴瀵硅薄
		URLConnection urlConn=url.openConnection();
		//杩炴帴鍒皍rl鎸囧畾鐨勮祫婧�
		urlConn.connect();
		return urlConn.getContentLength();
		
	}
}