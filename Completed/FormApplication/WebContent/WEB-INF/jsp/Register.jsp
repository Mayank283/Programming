<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit Contact</title>
</head>
<body>
	<div align="center">
		<h1>New/Edit Contact</h1>
		<form:form action="success" method="post" modelAttribute="user">
			<table>

				<tr>
					<td>Isn:</td>
					<td><form:input path="isn" /></td>
				</tr>
				<tr>
					<td>Sort Code:</td>
					<td><form:input path="srt_cde" /></td>
				</tr>
				<tr>
					<td>Payee Name:</td>
					<td><form:input path="payee_name" /></td>
				</tr>
				<tr>
					<td>Account No.:</td>
					<td><form:input path="acc_num" /></td>
				</tr>
				<tr>
					<td>Cheque Serial No.:</td>
					<td><form:input path="chq_ser" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Save"></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>