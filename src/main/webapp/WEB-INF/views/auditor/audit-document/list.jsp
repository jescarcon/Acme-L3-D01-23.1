<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" uri="http://www.the-acme-framework.org/"%>

<acme:list>
	<acme:list-column code="auditor.audit.label.code" path="code" width="10%" />
	<acme:list-column code="auditor.audit.label.course" path="course.title" width="30%" />
	<acme:list-column code="auditor.audit.label.numRecords" path="numRecords" width="5%" />
	<acme:list-column code="auditor.audit.label.mark" path="mark" width="5%" />
	
</acme:list>



