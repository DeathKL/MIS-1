<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<title>用户信息</title>

    <link rel="stylesheet" type="text/css" href="themes/default/easyui.css"/>
    <link rel="stylesheet" type="text/css" href="themes/icon.css"/>
    <link rel="stylesheet" type="text/css" href="themes/esui.css"/>
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="js/esui.js"></script>

    <script type="text/javascript">
    	
 		
 		
 		
    </script>
    </head>
<!--1. 在整个页面创建布局面板-->
<body>
   <form id="searchOCF" method="post"  style="text-align:center;">
    	<div>
			<label for="name">请输入订单号:</label>
			<br/>
			<input class="easyui-validatebox mgt" type="text" id="searchOrderCode"name="searchOrderCode" data-options="required:true" />
			<br/>
			<a id="btnSearchOrder" class="easyui-linkbutton mgt" icon="icon-ok" href="javascript:void(0)" onclick="SrchOrderStatus()"> 确定</a> 
    	</div>   		 
	</form>
	
</body>
</html>

