<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function loadAdd(){
	document.forms["form1"].action="add.htm";
	document.forms["form1"].submit();
}
function loadsub(){
		document.forms["form1"].action="sub.htm";
		document.forms["form1"].submit();
}
function loadMul(){
		document.forms["form1"].action="mul.htm";
		document.forms["form1"].submit();
}
function loadDiv(){
		document.forms["form1"].action="div.htm";
		document.forms["form1"].submit();
}

</script>

</head>
<body background="3.jpg">

<h1><marquee><font color="blue">Calculator</font></marquee></h1>

<form name="form1" method="post"><br>
<center>
<font color="red">First:<input type="text" name="a"><br></font>
<font color="red">Second:<input type="text" name="b"><br></font>
<input type="submit" value="add" onclick="javascript:loadAdd()"/>
<input type="submit" value="sub" onclick="javascript:loadSub()"/>
<input type="submit" value="mul" onclick="javascript:loadMul()"/>
<input type="submit" value="div" onclick="javascript:loadDiv()"/>
</center>
</form>
</body>
</html>