<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>insert image</h2>
<form name="uploadImage" id="uploadImage" action="./uploadImage">
<table><tr>
<td>Id</td><td><input type="text" id="id" name="id" value="">
</td></tr>
<tr>
<td>Image</td><td><input type="file" name="image" id="image" value=""></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="upload"></td>
</tr>

</table>
</form>

</body>
</html>