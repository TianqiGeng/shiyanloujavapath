package cn.tq.upload;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UploadAction extends ActionSupport{
	private static final long serialVersionUID=1L;
	//上传文件的人
	private String uploader;
	//上传文件
	private File upload;
	//上传文件类型
	private String uploadContentType;
	//上传文件名字
	private String uploadFileName;
	//上传文件的保存路径
	private String savePath;
	//get/set方法
	public String getUploader() {
		return uploader;
	}
	public void setUploader(String uploader) {
		this.uploader = uploader;
	}
	public File getUpload() {
		return upload;
	}
	public void setUpload(File upload) {
		this.upload = upload;
	}
	public String getUploadContentType() {
		return uploadContentType;
	}
	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}
	public String getUploadFileName() {
		return uploadFileName;
	}
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	public String getSavePath() {
		return ServletActionContext.getServletContext().getRealPath(savePath);
	}
	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}
	
	//execute()方法
	public String execute() throws IOException {
		//设置上传的文件保存路径
		String realpath=getSavePath();
		//判断上传文件是否为空
		if(upload !=null) {
			File savefile=new File(realpath,getUploadFileName());
			System.out.println(getUploadFileName());
			if(!savefile.getParentFile().exists())
				savefile.getParentFile().mkdirs();
				//把上传文件拷贝到新路径下，完成上传
				FileUtils.copyFile(upload,savefile);
				//设置request对象值，表示上传成功
				ActionContext.getContext().put("message","upload succeed!");
				return "success";
		}
		return "error";
		
	}

	
	
	
	
}
