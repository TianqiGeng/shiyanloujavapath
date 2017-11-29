package cn.tq.upload;

import java.io.FileNotFoundException;
import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class DownloadAction extends ActionSupport{
	private static final long seriaVersionUID=1L;
	private String downloadPath;
	private String filename;
	public String getDownloadPath() {
		return downloadPath;
	}
	public void setDownloadPath(String downloadPath) {
		this.downloadPath = downloadPath;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public InputStream getTargetFile() throws FileNotFoundException{
		//获得下载文件的真是路径
		String realPath=downloadPath+"/"+getFilename();
		//返回下载文件对应的输入流
		System.out.println(realPath+"ssssssssssssss");
		System.out.println(ServletActionContext.getServletContext().getResourceAsStream(realPath));
		return ServletActionContext.getServletContext().getResourceAsStream(realPath);
		
	}
	public String execute() {
		return "success";
	}
}
