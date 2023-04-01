<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" uri="http://www.the-acme-framework.org/"%>

<acme:form>
	<acme:input-textarea code="company.practicum.form.label.code" path="code"/>
	<acme:input-textarea code="company.practicum.form.label.title" path="title"/>
	<acme:input-textarea code="company.practicum.form.label.abstractt" path="abstractt"/>
	<acme:input-textarea code="company.practicum.form.label.goals" path="goals"/>
</acme:form>