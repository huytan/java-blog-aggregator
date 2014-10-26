<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<form:form commandName="user" cssClass="form-horizontal">
	<div class="form-group">
		<label for="name" class="col-sm-2 control-lable">Name:</label>
		<div class="col-sm-10">
			<form:input path="name" cssClass="form-control"/>
		</div>
	</div>
	
	<div class="form-group">
		<label for="email" class="col-sm-2 control-lable">Email:</label>
		<div class="col-sm-10">
			<form:input path="email" cssClass="form-control"/>
		</div>
	</div>
	
	<div class="form-group">
		<label for="password" class="col-sm-2 control-lable">Password:</label>
		<div class="col-sm-10">
			<form:password path="password" cssClass="form-control"/>
		</div>
	</div>
	
	<div class="form-group">
		<div class="col-sm-2">
			<input type="submit" value="Save" class="btn btn-lg btn-primary"/>
		</div>
	</div>

</form:form>