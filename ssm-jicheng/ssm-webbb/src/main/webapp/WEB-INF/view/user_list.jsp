<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1" >
	<tr>
		<th>id</th>
		<th>用户名</th>
		<th>密码</th>
		<th>年龄</th>
		<th>操作</th>
	</tr>
	
	<c:forEach items="${users}" var="user">
		<tr>
			<td>${user.id }</td>
			<td>${user.name}</td>
			<td>${user.password}</td>
			<td>${user.age}</td>
			<td>
			<a onclick="jump(${user.id})"href="javascript:void(0);">删除</a>
			<a href="#">添加</a>
			</td>
		</tr>
	</c:forEach>
	
</table>
</body>
<script type="text/javascript">
function jump(id){
	
	
	location.href="/ssm/method2?id="+id;
	
	
}

</script>
</html>