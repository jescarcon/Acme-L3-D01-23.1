<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" uri="http://www.the-acme-framework.org/"%>


<acme:list>
	<acme:list-column code="student.enrolment.list.label.code" path="code" width="20%"/>
	<acme:list-column code="student.enrolment.list.label.motivation" path="motivation" width="20%"/>
	<acme:list-column code="student.enrolment.list.label.goals" path="goals" width="20%"/>
	<acme:list-column code="student.enrolment.list.label.courseCode" path="courseCode" width="20%"/>
</acme:list>

<acme:button code="student.enrolment.list.button.create" action="/student/enrolment/create"/>