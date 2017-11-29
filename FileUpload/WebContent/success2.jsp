<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Files</title>
</head>
<body>
<%String path=request.getContextPath(); 
String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";%>
<h1>upload succeed!</h1>
file name:<s:property value="+uploadsFileName[0]"/><br/>
file type:<s:property value="+uploadsContentType[0]"/><br/>
file address:<p><%=basePath %><s:property value="'uploadFiles/'+uploadsFileName[0]"/>
<a href="download.action?filename=<s:property value="+ uploadsFileName[0]"/>">download</a><br/><br/>

file name:<s:property value="+uploadsFileName[1]"/><br/>
file type:<s:property value="+uploadsContentType[1]"/><br/>
file address:<p><%=basePath %><s:property value="'uploadFiles/'+uploadsFileName[1]"/></p><br/>
<a href="download.action?filename=<s:property value="+ uploadsFileName[1]"/>">download</a><br/><br/>

file name:<s:property value="+uploadsFileName[1]"/><br/>
file type:<s:property value="+uploadsContentType[1]"/><br/>
file address:<p><%=basePath %><s:property value="'uploadFiles/'+uploadsFileName[1]"/></p><br/>
<a href="download.action?filename=<s:property value="+ uploadsFileName[2]"/>">download</a><br/><br/>
</body>
</html>